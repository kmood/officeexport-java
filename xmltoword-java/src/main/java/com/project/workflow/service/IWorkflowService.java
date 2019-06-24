
package com.project.workflow.service;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface IWorkflowService {

	/**
	 * 部署流程定义
	 * @param file
	 * @param filename
	 */
//	void saveNewDeploye(File file, String filename);

	/**
	 * 查询部署对象信息，对用表（act_re_deployment）
	 * @return
	 */
	List<Deployment> findDeploymentList();

	/**
	 * 查询流程定义的信息，对应表（act_re_procdef）
	 * @return
	 */
	List<ProcessDefinition> findProcessDefinitionList();

	/**
	 * 使用部署对象ID和资源图片名称，获取图片的输入流
	 * @param deploymentId
	 * @param imageName
	 * @return
	 */
	InputStream findImageInputStream(String deploymentId, String imageName);

	/**使用部署对象ID，删除流程定义*/
	void deleteProcessDefinitionByDeploymentId(String deploymentId);

	/**更新请假状态，启动流程实例，让启动的流程实例关联业务
	 * @return */
	String saveStartProcess(String key, String objId, Map<String, Object> variables);

	void completeMyPersonalTask(String sjid, String userid, Map<String, Object> variables);


	/**
	 * 查询当前用户下的任务
	 * @param name
	 * @return
	 */
	public void  deleteMyPersonalTask(String sjid, String userid);

	public void deleteProcessInstance(String name, String sjid);
	public List<Task> findTaskListByName(String name);




	List<String> findHistoryTask(String type, String assignee, String taskName);

	List<HistoricProcessInstance> findHistoryProcInst(String businessKey);

	List<String> findCurrentTask(String type, String assignee, String taskName);

	List<Task> findTaskListByNameAndTaskName(String name, String taskName);


	void saveNewDeploye(String bpmn, String key, String filename);

	Map<String, Object> findNotFinishedTask(String businessKey);

	String completeMyPersonalTask(String sjid, String userid, Map<String, Object> variables, String ModularName);

	boolean isFinished(String name, String sjid, String tableName);

	List<Task> findTaskListByNameAndTaskName(String name);

	List<String> findCurrentTask(String type, String assignee);

	List<Task> findTaskListByNameAndProcessDefinitionKey(String type, String name);

	List<Map<String, Object>> findCurrentTaskMap(String type, String assignee);

	List<HistoricTaskInstance> findHistoryTaskListByNameAndProcessDefinitionKey(String type, String name);

	List<Task> findTaskListByNameAndBusinessKey(String name, String businessKey);

	List<Task> findTaskListByNameAndTaskName(String name, String taskName, String type);

	List<Map<String,Object>> findHistoryCompletedTask(String type, String sjid);

}