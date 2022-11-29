package com.ontrack.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class TaskDTO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	

	@Column(name = "id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="description")
	private String description;
	
	@Column(name="due_date")
	private String dueDate;
	
	// Set default constructor
	public TaskDTO() {
		
	}
	
	// Set constructors
	public TaskDTO(int id, String name, String type, String description, String dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.dueDate = dueDate;
	}
	
	// Set getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	// Set toString method
	@Override
	public String toString() {
		return "TaskDTO [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description
				+ ", dueDate=" + dueDate + "]";
	}

}
