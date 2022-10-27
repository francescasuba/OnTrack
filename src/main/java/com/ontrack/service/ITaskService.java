package com.ontrack.service;

import com.ontrack.dto.TaskDTO;

/**
 * CRUD operations for tasks
 *
 */
public interface ITaskService {


	TaskDTO fetchById(int id);
	
	/**
	 * Persists the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(TaskDTO taskDTO);

}
