package com.ontrack.service;

import java.util.List;

import com.ontrack.dto.TaskDTO;

/**
 * CRUD operations for tasks
 *
 */
public interface ITaskService {
	public List<TaskDTO> findAll();
	public TaskDTO findById(int id);
	public void save(TaskDTO theFaculty);
	public void deleteById(int id);
}

