package com.ontrack.dto;

public class TaskDTO {

	private int id;
	private String name;
	private String type;
	private String description;
	private String dueDate;
	
	public TaskDTO(int id, String name, String type, String description, String dueDate) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.dueDate = dueDate;
	}

	public int getTaskId() {
		return id;
	}

	public void setTaskId(int id) {
		this.id = id;
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

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "TaskDTO [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description
				+ ", dueDate=" + dueDate + "]";
	}

}
