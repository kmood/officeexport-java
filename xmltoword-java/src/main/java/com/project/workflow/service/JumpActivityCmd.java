package com.project.workflow.service;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.ProcessDefinitionImpl;

import java.util.List;
import java.util.Map;

public class JumpActivityCmd implements Command<ExecutionEntity>{

	private String activityId;
	private String processInstanceid;
	
	public JumpActivityCmd(String activityId, String processInstanceid) {
		super();
		this.activityId = activityId;
		this.processInstanceid = processInstanceid;
	}

	@Override
	public ExecutionEntity execute(CommandContext commandContext) {
		// TODO Auto-generated method stub
		ExecutionEntity executionEntity = commandContext.getExecutionEntityManager().
				findExecutionById(processInstanceid);
		List<TaskEntity> taskEntityManager = commandContext.getTaskEntityManager().findTasksByProcessInstanceId(processInstanceid);
		
		Map<String,Object> variables = executionEntity.getVariables();
		executionEntity.destroyScope("jump");
//		executionEntity.destroyScope("deleted");
		
		ProcessDefinitionImpl processDefinition = executionEntity.getProcessDefinition();
		ActivityImpl activity = processDefinition.findActivity(activityId);
		activity.setVariables(variables);
		executionEntity.executeActivity(activity);
		return executionEntity;
	}
	
	
	
	    
	
}
