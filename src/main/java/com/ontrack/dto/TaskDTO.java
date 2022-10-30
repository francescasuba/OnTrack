package com.ontrack.dto;

public class TaskDTO {

	private int taskId;
	//I would change this to task or task-name
	private String name;
	private String type;
	private String description;
	
	public TaskDTO(int taskId, String name, String type, String description) {
		this.taskId = taskId;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TaskDTO [taskId=" + taskId + ", name=" + name + ", type=" + type + ", description=" + description + "]";
	}

}
