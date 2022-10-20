package com.ontrack.dto;

public class TaskDTO {

	private int taskId;
	private String taskType;
	private String taskDescription;
	
	@Override
	public String toString() {
		return taskId + " " + taskType + " " + taskDescription;
	}

}
