package com.ontrack.dto;

public class TaskDTO {

	private int taskId;
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	private String taskType;
	private String taskDescription;
	
	@Override
	public String toString() {
		return taskId + " " + taskType + " " + taskDescription;
	}

}
