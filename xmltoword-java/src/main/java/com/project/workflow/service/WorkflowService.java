
package com.project.workflow.service;

import com.project.basic.entity.PRIVS_USER;
import com.project.basic.mapper.EntityModelMapper;
import com.project.basic.mapper.PRIVS_USERMapper;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.*;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.bpmn.behavior.AbstractBpmnActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

//@Service
public class WorkflowService implements IWorkflowService {

	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private HistoryService historyService;
	@Autowired
	private ManagementService managementService;
	@Autowired
	private PRIVS_USERMapper userMapper;
	@Autowired
	protected EntityModelMapper entityModelMapper;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#saveNewDeploye(java.io.
	 * File, java.lang.String)
	 */
	// @Override
	// public void saveNewDeploye(File file, String filename) {
	// try {
	// //2：将File类型的文件转化成ZipInputStream流
	// ZipInputStream zipInputStream = new ZipInputStream(new
	// FileInputStream(file));
	// repositoryService.createDeployment()//创建部署对象
	// .name(filename)//添加部署名称
	// .addZipInputStream(zipInputStream)//
	// .deploy();//完成部署
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	@Override
	public void saveNewDeploye(String bpmn, String key, String filename) {
		try {
			repositoryService// 与流程定义和部署对象相关的Service
					.createDeployment()// 创建一个部署对象
					.name(key).addInputStream(filename, new FileInputStream(bpmn))// 添加部署的名称
					.deploy();// 完成部署
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mc.imis.workflow.service.IWorkflowService#findDeploymentList()
	 */
	@Override
	public List<Deployment> findDeploymentList() {
		List<Deployment> list = repositoryService.createDeploymentQuery()// 创建部署对象查询
				.orderByDeploymenTime().asc()//
				.list();
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#findProcessDefinitionList()
	 */
	@Override
	public List<ProcessDefinition> findProcessDefinitionList() {
		List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery()// 创建流程定义查询
				.orderByProcessDefinitionVersion().asc()//
				.list();
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#findImageInputStream(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public InputStream findImageInputStream(String deploymentId, String imageName) {
		return repositoryService.getResourceAsStream(deploymentId, imageName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mc.imis.workflow.service.IWorkflowService#
	 * deleteProcessDefinitionByDeploymentId(java.lang.String)
	 */
	@Override
	public void deleteProcessDefinitionByDeploymentId(String deploymentId) {
		repositoryService.deleteDeployment(deploymentId, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#saveStartProcess(java.lang.
	 * String)
	 */
	@Override
	public String saveStartProcess(String key, String objId, Map<String, Object> variables) {
		return runtimeService.startProcessInstanceByKey(key, objId, variables).getId();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#completeMyPersonalTask(java
	 * .lang.String, java.lang.String)
	 */
	@Override
	public void completeMyPersonalTask(String sjid, String userid, Map<String, Object> variables) {
		List<Task> taskList = findTaskListByName(userid);
		for (Task task : taskList) {
			// 2：使用任务对象Task获取流程实例ID
			String processInstanceId = task.getProcessInstanceId();
			// 3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
			ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
					.processInstanceId(processInstanceId)// 使用流程实例ID查询
					.singleResult();
			// 4：使用流程实例对象获取BUSINESS_KEY
			String buniness_key = pi.getBusinessKey();
			if (StringUtils.isNotBlank(buniness_key)) {
				if (buniness_key.split("\\.")[1].equals(sjid)) {
					taskService// 与正在执行的任务管理相关的Service
							.complete(task.getId(), variables);
					// pi = runtimeService.createProcessInstanceQuery()//
					// .processInstanceId(processInstanceId)//使用流程实例ID查询
					// .singleResult();
				}
			}

		}
	}

	@Override
	public String completeMyPersonalTask(String sjid, String userid, Map<String, Object> variables, String ModularName) {
		List<Task> taskList = findTaskListByNameAndBusinessKey(userid, ModularName + "." + sjid);
		if(taskList == null || taskList.isEmpty()) return null;
		String procExecutionId = null;
		for (Task task : taskList) {
			procExecutionId = task.getExecutionId();
			taskService.complete(task.getId(), variables);// 与正在执行的任务管理相关的Service
			// 2：使用任务对象Task获取流程实例ID
			// String processInstanceId = task.getProcessInstanceId();
			// //3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
			// ProcessInstance pi =
			// runtimeService.createProcessInstanceQuery()//
			// .processInstanceId(processInstanceId)//使用流程实例ID查询
			// .singleResult();
			// //4：使用流程实例对象获取BUSINESS_KEY
			// String buniness_key = pi.getBusinessKey();
			// if(StringUtils.isNotBlank(buniness_key)){
			// if(buniness_key.split("\\.")[1].equals(sjid) &&
			// buniness_key.split("\\.")[0].equals(ModularName)){
			// taskService//与正在执行的任务管理相关的Service
			// .complete(task.getId(),variables);
			//// pi = runtimeService.createProcessInstanceQuery()//
			//// .processInstanceId(processInstanceId)//使用流程实例ID查询
			//// .singleResult();
			// }
			// }
			//
		}
		return procExecutionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#shIsFinished(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public boolean isFinished(String name, String sjid, String tableName) {
		List<Task> taskList = findTaskListByName(name);
		for (Task task : taskList) {
			// 2：使用任务对象Task获取流程实例ID
			String processInstanceId = task.getProcessInstanceId();
			// 3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
			ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
					.processInstanceId(processInstanceId)// 使用流程实例ID查询
					.singleResult();
			// 4：使用流程实例对象获取BUSINESS_KEY
			String buniness_key = pi.getBusinessKey();
			if (StringUtils.isNotBlank(buniness_key)) {
				if (buniness_key.split("\\.")[1].equals(sjid) && buniness_key.split("\\.")[0].equals(tableName)) {
					return true;
				}

			}
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mc.imis.workflow.service.IWorkflowService#findTaskListByName(java.
	 * lang.String)
	 */
	@Override
	public List<Task> findTaskListByName(String name) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name)// 指定个人任务查询
				.orderByTaskCreateTime().asc()//
				.list();
		return list;
	}
	@Override
	public List<HistoricProcessInstance> findHistoryProcInst(String businessKey) {
		List<HistoricProcessInstance> procInstList = historyService.createHistoricProcessInstanceQuery().processInstanceBusinessKey(businessKey)
		.orderByProcessInstanceStartTime().desc()
		.list();
		return procInstList;
	}
	public List<Task> findTaskListByTableName(String tableName, int from, int limit) {
		List<Task> list = taskService.createTaskQuery()//
				.processInstanceBusinessKeyLike(tableName + ".%")// 指定模块任务查询
				.orderByTaskCreateTime().asc()//
				.listPage(from, limit);
		return list;
	}

	public int countTaskListByTableName(String tableName) {
		List<Task> list = taskService.createTaskQuery()//
				.processInstanceBusinessKeyLike(tableName + ".%")// 指定模块任务查询
				.orderByTaskCreateTime().asc()//
				.list();
		return list.size();
	}

	public int countTaskListByBusinessKey(String businessKey) {
		List<Task> list = taskService.createTaskQuery()//
				.processInstanceBusinessKey(businessKey)// 指定业务ID
				.orderByTaskCreateTime().asc()//
				.list();
		return list.size();
	}

	public List<Task> findTaskListByTableName(String tableName, String assignee) {
		List<Task> list = taskService.createTaskQuery().taskAssignee(assignee)//
				.processInstanceBusinessKeyLike(tableName + ".%")// 指定模块任务查询
				.orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public void deleteProcessInstance(String name, String sjid) {
		List<Task> taskList = findTaskListByName(name);
		for (Task task : taskList) {
			// 2：使用任务对象Task获取流程实例ID
			String processInstanceId = task.getProcessInstanceId();
			// 3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
			// 4：使用流程实例对象获取BUSINESS_KEY
			ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
					.processInstanceId(processInstanceId)// 使用流程实例ID查询
					.singleResult();
			String buniness_key = pi.getBusinessKey();
			if (StringUtils.isNotBlank(buniness_key)) {
				if (buniness_key.split("\\.")[1].equals(sjid)) {
					runtimeService.deleteProcessInstance(processInstanceId, "取消");
				}

			}
		}
	}

	@Override
	public void deleteMyPersonalTask(String sjid, String userid) {
		List<Task> taskList = findTaskListByName(userid);
		for (Task task : taskList) {
			// 2：使用任务对象Task获取流程实例ID
			String processInstanceId = task.getProcessInstanceId();
			// 3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
			ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
					.processInstanceId(processInstanceId)// 使用流程实例ID查询
					.singleResult();
			// 4：使用流程实例对象获取BUSINESS_KEY
			String buniness_key = pi.getBusinessKey();
			if (StringUtils.isNotBlank(buniness_key)) {
				if (buniness_key.split("\\.")[1].equals(sjid)) {
					taskService// 与正在执行的任务管理相关的Service
							.deleteTask(task.getId());
					// pi = runtimeService.createProcessInstanceQuery()//
					// .processInstanceId(processInstanceId)//使用流程实例ID查询
					// .singleResult();
				}
			}

		}
	}

	@Override
	public List<String> findHistoryTask(String type, String assignee, String taskName) {
		List<String> idsList = new ArrayList<>();
		List<HistoricTaskInstance> list = historyService// 与历史数据（历史表）相关的Service
				.createHistoricTaskInstanceQuery()// 创建历史任务实例查询
				.taskAssignee(assignee).taskName(taskName).processInstanceBusinessKeyLike(type + ".%").finished().taskDeleteReason("completed")
				.orderByTaskCreateTime().asc().list();
		if (list != null && list.size() > 0) {
			for (HistoricTaskInstance hti : list) {
				HistoricProcessInstance hpi = historyService.createHistoricProcessInstanceQuery()//
						.processInstanceId(hti.getProcessInstanceId())// 使用流程实例ID查询
						.singleResult();
				if (hpi.getBusinessKey().split("\\.")[0].equals(type)) {
					idsList.add(hpi.getBusinessKey().split("\\.")[1]);
				}
			}
		}

		return idsList;
	}

	@Override
	// 查找当前流程已完成任务节点
	public List<Map<String, Object>> findHistoryCompletedTask(String type, String sjid) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		List<HistoricTaskInstance> list = historyService// 与历史数据（历史表）相关的Service
				.createHistoricTaskInstanceQuery()// 创建历史任务实例查询
				.processInstanceBusinessKey(type + "." + sjid).finished().taskDeleteReason("completed").orderByTaskCreateTime().asc().list();
		if (list != null && list.size() > 0) {
			for (HistoricTaskInstance hti : list) {
				Map<String, Object> map = new HashMap<>();
				map.put("taskName", hti.getName());
				PRIVS_USER privs_user = userMapper.selectByPrimaryKey(hti.getAssignee());
				map.put("assignee", privs_user!= null ?privs_user.getREALNAME():"");
				map.put("taskId", hti.getTaskDefinitionKey());
				map.put("lzzt", 2);
				map.put("processId", hti.getProcessInstanceId());
				resultList.add(map);
			}
		}

		return resultList;
	}

	// 查找正在进行的任务
	public List<Map<String, Object>> findCurrentRunningTask(String type, String sjid) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		List<Task> list = taskService// 与历史数据（历史表）相关的Service
				.createTaskQuery()// 创建历史任务实例查询
				.processInstanceBusinessKey(type + "." + sjid).orderByTaskCreateTime().asc().list();
		if (list != null && list.size() > 0) {
			int  i = 0;
			Map<String, Object> map = new HashMap<>();
			for (Task tsk : list) {
				if(i == 0){
					map.put("taskName", tsk.getName());
					PRIVS_USER privs_user = userMapper.selectByPrimaryKey(tsk.getAssignee());
					map.put("assignee", privs_user!= null ?privs_user.getREALNAME():"");
					map.put("taskId", tsk.getTaskDefinitionKey());
					map.put("lzzt", 1);
					map.put("processId", tsk.getProcessInstanceId());
				}else{
					map.put("assignee", map.get("assignee")+"/"+userMapper.selectByPrimaryKey(tsk.getAssignee()).getREALNAME());
				}
				i++;
			}
			resultList.add(map);
		}

		return resultList;
	}

	@Override
	public List<Task> findTaskListByNameAndTaskName(String name, String taskName) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).taskName(taskName).orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	public List<Task> findTaskListByNameAndTaskNameAndBusinessKey(String BusinessKey, String name, String taskName) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).taskNameLike(taskName).processInstanceBusinessKey(BusinessKey)
				.orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public List<Task> findTaskListByNameAndTaskName(String name, String taskName, String type) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).taskName(taskName)// 指定个人任务查询
				.processInstanceBusinessKeyLike(type + ".%").orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public List<Task> findTaskListByNameAndBusinessKey(String name, String businessKey) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).processInstanceBusinessKey(businessKey)// 指定个人任务查询
				.orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public List<Task> findTaskListByNameAndTaskName(String name) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public List<Task> findTaskListByNameAndProcessDefinitionKey(String type, String name) {
		List<Task> list = taskService.createTaskQuery()//
				.taskAssignee(name).processDefinitionKey(type).orderByTaskCreateTime().desc()//
				.list();
		return list;
	}

	@Override
	public List<HistoricTaskInstance> findHistoryTaskListByNameAndProcessDefinitionKey(String type, String name) {
		List<HistoricTaskInstance> list = historyService.createHistoricTaskInstanceQuery()//
				.taskAssignee(name).processDefinitionKey(type).orderByTaskCreateTime().asc()//
				.list();
		return list;
	}

	@Override
	public List<String> findCurrentTask(String type, String assignee, String taskName) {
		List<String> idsList = new ArrayList<>();
		List<Task> list = findTaskListByNameAndTaskName(assignee, taskName, type);
		if (list != null && list.size() > 0) {
			for (Task task : list) {
				String id = task.getProcessInstanceId();
				ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
						.processInstanceId(id)// 使用流程实例ID查询
						.singleResult();
//				if (!processService.isDataExist(type, pi.getBusinessKey().split("\\.")[1]))
//					continue;
				if (pi.getBusinessKey().split("\\.")[0].equals(type)) {
					idsList.add(pi.getBusinessKey().split("\\.")[1]);
				}
			}
		}

		return idsList;
	}

	@Override
	public List<String> findCurrentTask(String type, String assignee) {
		List<String> idsList = new ArrayList<>();
		List<Task> list = findTaskListByNameAndProcessDefinitionKey(type, assignee);
		if (list != null && list.size() > 0) {
			for (Task task : list) {
				ProcessInstance pi = runtimeService.createProcessInstanceQuery().processDefinitionKey(type)//
						.processInstanceId(task.getProcessInstanceId())// 使用流程实例ID查询
						.singleResult();
//				if ("".equals(pi.getBusinessKey())
//						|| !processService.isDataExist(type, pi.getBusinessKey().split("\\.")[1]))
//					continue;
				idsList.add(pi.getBusinessKey().split("\\.")[1]);
			}
		}

		return idsList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> findCurrentTaskMap(String type, String assignee) {
		List<Map<String, Object>> listMap = new ArrayList<>();
		List<Task> list = findTaskListByNameAndProcessDefinitionKey(type, assignee);
		if (list != null && list.size() > 0) {
			for (Task task : list) {
				ProcessInstance pi = runtimeService.createProcessInstanceQuery().processDefinitionKey(type)//
						.processInstanceId(task.getProcessInstanceId())// 使用流程实例ID查询
						.singleResult();
				// if(pi.getBusinessKey().split("\\.")[0].equals(type)){
//				if ("".equals(pi.getBusinessKey())
//						|| !processService.isDataExist(type, pi.getBusinessKey().split("\\.")[1]))
//					continue;
				Map<String, Object> map = new LinkedMap();
				map.put("id", pi.getBusinessKey().split("\\.")[1]);
				map.put("taskName", task.getName());
				map.put("time", task.getCreateTime());
				listMap.add(map);
				// }
			}
		}

		return listMap;
	}

	// 统计某一流程已完成的任务数量
	public int countFinishedTask(String type, String assignee) {
		int count = 0;
		List<HistoricTaskInstance> list = findHistoryTaskListByNameAndProcessDefinitionKey(type, assignee);
		if (list != null)
			count = list.size();
		return count;
	}

	// 统计某一流程未完成的任务数量
	public int countNotFinishedTask(String type, String assignee) {
		int count = 0;
		List<Task> list = findTaskListByNameAndProcessDefinitionKey(type, assignee);
		if (list != null) {
			for (Task task : list) {
				ProcessInstance pi = runtimeService.createProcessInstanceQuery().processDefinitionKey(type)//
						.processInstanceId(task.getProcessInstanceId())// 使用流程实例ID查询
						.singleResult();
				// if(pi.getBusinessKey().split("\\.")[0].equals(type)){
//				if ("".equals(pi.getBusinessKey())
//						|| !processService.isDataExist(type, pi.getBusinessKey().split("\\.")[1]))
//					continue;
				count++;
			}
		}

		return count;
	}

	/**
	 * 查询某一模块所有未完成任务
	 * 
	 * @Title NotFinishedTask
	 * @Description TODO
	 * @param type
	 * @return
	 * @author sunsz
	 * @time 2017年2月23日 下午5:09:31
	 */
	public List<Map<String, Object>> NotFinishedTask(String type, int from, int limit) {
		List<Task> list = findTaskListByTableName(type, from, limit);
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		if (list != null) {
			for (Task task : list) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("userId", task.getAssignee());
				map.put("taskName", task.getName());
				map.put("taskId", task.getId());
				ProcessInstance pi = runtimeService.createProcessInstanceQuery().processDefinitionKey(type)//
						.processInstanceId(task.getProcessInstanceId())// 使用流程实例ID查询
						.singleResult();
				map.put("sjid", pi.getBusinessKey().split("\\.")[1]);
				resultList.add(map);
			}
		}
		return resultList;
	}

	public int countNotFinishedTask(String type) {
		int total = countTaskListByTableName(type);
		return total;
	}

	public List<String> getWorkflowPoint(String processDefinitionId) {
		BpmnModel model = repositoryService.getBpmnModel(processDefinitionId);
		List<String> resultList = new ArrayList<>();
		List<FlowElement> list = new ArrayList<>();
		if (model != null) {
			Collection<FlowElement> flowElements = model.getMainProcess().getFlowElements();
			for (FlowElement e : flowElements) {
				if (e instanceof UserTask) {
					list.add(e);
					resultList.add(e.getName());
				}
			}
		}
		return resultList;
	}
	public List<FlowElement> getWorkflowPointRetrunFlowElements(String processDefinitionId) {
		BpmnModel model = repositoryService.getBpmnModel(processDefinitionId);
		List<FlowElement> list = new ArrayList<>();
		if (model != null) {
			Collection<FlowElement> flowElements = model.getMainProcess().getFlowElements();
			for (FlowElement e : flowElements) {
				if (e instanceof UserTask) {
					list.add(e);
				}
			}
		}
		return list;
	}


	/**
	 * 任务委派
	 * 
	 * @Title delegateTask
	 * @Description TODO
	 * @param taskId
	 * @param delegateUserId
	 * @author sunsz
	 * @time 2017年2月23日 下午6:54:14
	 */
	public void delegateTask(String taskId, String delegateUserId) {
		taskService.setAssignee(taskId, delegateUserId);
	}

	/**
	 * 删除任务
	 * 
	 * @Title deleteTask
	 * @Description TODO
	 * @param taskId
	 *            任务id
	 * @author sunsz
	 * @time 2017年2月24日 下午1:28:12
	 */
	public void deleteTask(String taskId) {
		taskService.deleteTask(taskId);
	}

	@Override
	public Map<String, Object> findNotFinishedTask(String businessKey) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Task> list = taskService.createTaskQuery()//
				.processInstanceBusinessKey(businessKey).orderByTaskCreateTime().asc()//
				.list();

		for (Task task : list) {
			map.put(task.getAssignee(), task.getName());
		}
		return map;
	}

	/**
	 * 流程节点跳转
	 * 
	 * @Title executeCommandJump
	 * @Description TODO
	 * @param businessKey
	 * @author sunsz
	 * @time 2017年3月1日 上午11:24:25
	 */
	public void executeCommandJump(String businessKey, String tarTaskName) {
		List<HistoricTaskInstance> list = historyService// 与历史数据（历史表）相关的Service
				.createHistoricTaskInstanceQuery()// 创建历史任务实例查询
				.processInstanceBusinessKey(businessKey).taskName(tarTaskName).orderByTaskCreateTime().desc().list();
		if (list == null || list.size() == 0)
			return;
		managementService.executeCommand(
				new JumpActivityCmd(list.get(0).getTaskDefinitionKey(), list.get(0).getProcessInstanceId()));
	}

	public void executeCommandJumpByActivityId(String businessKey, String activitiId) {
		ProcessInstance pi = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey)
				.singleResult();
		String processInstanceId = pi.getProcessInstanceId();
//		String id = taskService.createTaskQuery().processInstanceId(pi.getProcessInstanceId()).singleResult().getId();
//		taskService.deleteTask(id, true);
		managementService.executeCommand(new JumpActivityCmd(activitiId, pi.getId()));
		entityModelMapper.updateSql(" update ACT_HI_TASKINST set DELETE_REASON_ = 'jump' where PROC_INST_ID_ = '"+processInstanceId+"' and  DELETE_REASON_ = 'completed'" );
	}

	/**
	 * 获取当前节点上一个节点
	 * 
	 * @Title getPreviousTask
	 * @Description TODO

	 * @author sunsz
	 * @time 2017年3月2日 下午4:23:17
	 */
	public List<Map<String, Object>> getPreviousTask(String businessKey, String type, String condition)
			throws Exception {
		List<Task> tasks = taskService.createTaskQuery().processInstanceBusinessKeyLike(businessKey).list();
		String excId = tasks.get(0).getExecutionId();
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId)
				.singleResult();
		String activitiId = execution.getActivityId();
		List<TaskDefinition> taskDefinitionList = new ArrayList<>();
		List<Map<String, Object>> resultMapList = new ArrayList<>();
		if ("".equals(condition))
			getNextTaskDefinition(type, activitiId, "", taskDefinitionList);
		else
			getNextTaskDefinitionByCondition(type, activitiId, condition, taskDefinitionList);
		for (TaskDefinition taskDefinition : taskDefinitionList) {
			Map<String, Object> map = new HashMap<>();
			map.put("key", taskDefinition.getKey());
			map.put("taskName", taskDefinition.getNameExpression().getExpressionText());
			resultMapList.add(map);
		}
		return resultMapList;
	}

	public void getPreviousTask2(String businessKey, String type) throws Exception {
		List<Task> tasks = taskService.createTaskQuery().processInstanceBusinessKeyLike(businessKey).list();
		String excId = tasks.get(0).getExecutionId();
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId)
				.singleResult();
		String activitiId = execution.getActivityId();
		List<TaskDefinition> taskDefinitionList = new ArrayList<>();
		getNextTaskDefinition(type, activitiId, "", taskDefinitionList);
		// map.put("key", taskDefinition.getKey());
		// map.put("taskName",
		// taskDefinition.getNameExpression().getExpressionText());
		// List<TaskDefinition> taskDefinitionList =
		// getNextTaskDefinition(type,activitiId,"");
		for (TaskDefinition taskDefinition : taskDefinitionList) {
			System.out.println(taskDefinition.getNameExpression().getExpressionText());
			System.out.println(taskDefinition.getKey());
		}
		// return map;
	}

	private void getNextTaskDefinition(String key, String activityId, String elString,
			List<TaskDefinition> taskDefinitionList) {
		ProcessDefinition processDefinition = getNewProcessDefinition(key);// 根据流程定义key获得最新的流程定义信息
		if (processDefinition != null) {
			// List<TaskDefinition> taskDefinitionList = new ArrayList<>();
			ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService)
					.getDeployedProcessDefinition(processDefinition.getId());
			ActivityImpl activityImpl = processDefinitionEntity.findActivity(activityId);// 当前节点
			List<PvmTransition> pvmTransitions = activityImpl.getIncomingTransitions();
			// List<PvmTransition> incomingpvmTransitions = null;
			for (PvmTransition pvmTransition : pvmTransitions) {
				PvmActivity pa = pvmTransition.getSource();// 获取所有的终点节点

				if (!"userTask".equals(pa.getProperty("type"))) {
					// incomingpvmTransitions = pa.getIncomingTransitions();
					// if (pvmTransitions.size() == 1) {
					// getNextTaskDefinition(key, pa.getId(),elString);
					// }else if (incomingpvmTransitions.size() > 1) {
					// for (PvmTransition incomingPvmTransition :
					// incomingpvmTransitions) {
					// Object object =
					// outPvmTransition.getProperty("conditionText");
					// if (elString.equals(StringUtils.trim(object.toString())))
					// {
					// PvmActivity pvmActivity =
					// incomingPvmTransition.getSource();
					getNextTaskDefinition(key, pa.getId(), elString, taskDefinitionList);
					// }
					// }
					// }
				} else if ("userTask".equals(pa.getProperty("type"))) {
					if (pa.getProperty("multiInstance") != null) {
						AbstractBpmnActivityBehavior abab = ((MultiInstanceActivityBehavior) ((ActivityImpl) pa)
								.getActivityBehavior()).getInnerActivityBehavior();
						UserTaskActivityBehavior utab = (UserTaskActivityBehavior) abab;
						taskDefinitionList.add(utab.getTaskDefinition());
					} else {
						((ActivityImpl) pa).getActivityBehavior();
						taskDefinitionList.add(((UserTaskActivityBehavior) ((ActivityImpl) pa).getActivityBehavior())
								.getTaskDefinition());
					}
					// return
					// ((UserTaskActivityBehavior)((ActivityImpl)pa).getActivityBehavior()).getTaskDefinition();
					// taskDefinitionList.add(((UserTaskActivityBehavior)((ActivityImpl)pa).getActivityBehavior()).getTaskDefinition());
				}
			}
			// return taskDefinitionList;
		}

		return;
	}

	private void getNextTaskDefinitionByCondition(String key, String activityId, String elString,
			List<TaskDefinition> taskDefinitionList) {
		ProcessDefinition processDefinition = getNewProcessDefinition(key);// 根据流程定义key获得最新的流程定义信息
		if (processDefinition != null) {
			// List<TaskDefinition> taskDefinitionList = new ArrayList<>();
			ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService)
					.getDeployedProcessDefinition(processDefinition.getId());
			ActivityImpl activityImpl = processDefinitionEntity.findActivity(activityId);// 当前节点
			List<PvmTransition> pvmTransitions = activityImpl.getIncomingTransitions();
			// List<PvmTransition> incomingpvmTransitions = null;
			for (PvmTransition pvmTransition : pvmTransitions) {
				// 获取所有的终点节点
				Object object = pvmTransition.getProperty("conditionText");
				if (elString.equals(StringUtils.trim(object.toString()))) {
					PvmActivity pa = pvmTransition.getSource();
					if (!"userTask".equals(pa.getProperty("type"))) {
						// incomingpvmTransitions = pa.getIncomingTransitions();
						// if (pvmTransitions.size() == 1) {
						// getNextTaskDefinition(key, pa.getId(),elString);
						// }else if (incomingpvmTransitions.size() > 1) {
						// for (PvmTransition incomingPvmTransition :
						// incomingpvmTransitions) {
						// Object object =
						// outPvmTransition.getProperty("conditionText");
						// if
						// (elString.equals(StringUtils.trim(object.toString())))
						// {
						// PvmActivity pvmActivity =
						// incomingPvmTransition.getSource();
						getNextTaskDefinition(key, pa.getId(), elString, taskDefinitionList);
						// }
						// }
						// }
					} else if ("userTask".equals(pa.getProperty("type"))) {
						if (pa.getProperty("multiInstance") != null) {
							AbstractBpmnActivityBehavior abab = ((MultiInstanceActivityBehavior) ((ActivityImpl) pa)
									.getActivityBehavior()).getInnerActivityBehavior();
							UserTaskActivityBehavior utab = (UserTaskActivityBehavior) abab;
							taskDefinitionList.add(utab.getTaskDefinition());
						} else {
							((ActivityImpl) pa).getActivityBehavior();
							taskDefinitionList
									.add(((UserTaskActivityBehavior) ((ActivityImpl) pa).getActivityBehavior())
											.getTaskDefinition());
						}
					}
				}
			}
		}

		return;
	}

	public ProcessDefinition getNewProcessDefinition(String key) {
		// 根据key查询已经激活的流程定义，并且按照版本进行降序。那么第一个就是将要得到的最新流程定义对象
		List<ProcessDefinition> processDefinitionList = repositoryService.createProcessDefinitionQuery()
				.processDefinitionKey(key).orderByProcessDefinitionVersion().desc().list();
		if (processDefinitionList.size() > 0) {
			return processDefinitionList.get(0);
		}
		return null;
	}

	public Object getVariable(String businessKey, String key) {
		List<Task> tasks = taskService.createTaskQuery().processInstanceBusinessKeyLike(businessKey).list();

		return taskService.getVariable(tasks.get(0).getId(), key);
	}
	public Map<String, Object> getVariables(String businessKey) {
		List<Task> tasks = taskService.createTaskQuery().processInstanceBusinessKeyLike(businessKey).list();
		if (tasks == null  || tasks.isEmpty()) return new HashMap<>();
		return taskService.getVariables(tasks.get(0).getId());
	}
	public void setVariable(String businessKey, String key, Object value) {
		List<Task> tasks = taskService.createTaskQuery().processInstanceBusinessKeyLike(businessKey).list();

		taskService.setVariable(tasks.get(0).getId(), key, value);
	}
	public String getCurrentProcStartTimeByBusinessKey(String businessKey){
//		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date startTime = null;
		String dt = null;
		List<HistoricProcessInstance> findHistoryProcInst = findHistoryProcInst(businessKey);
		if(findHistoryProcInst!= null && !findHistoryProcInst.isEmpty()){
			HistoricProcessInstance historicProcessInstance = findHistoryProcInst.get(0);
			startTime = historicProcessInstance.getStartTime();
			dt = dateTimeInstance.format(startTime);
		}
		return dt;	
	}
}
