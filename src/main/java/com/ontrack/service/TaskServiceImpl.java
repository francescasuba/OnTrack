package com.ontrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ontrack.dao.ITaskRepository;
import com.ontrack.dto.TaskDTO;

@Service
public class TaskServiceImpl implements ITaskService {
	
	private ITaskRepository taskRepository;
	
	@Autowired
	public TaskServiceImpl (ITaskRepository theTaskRepository) {
		taskRepository = theTaskRepository;
	}

	@Override
	public List<TaskDTO> findAll() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	@Override
	public TaskDTO findById(int id) {
		Optional<TaskDTO> taskId = taskRepository.findById(id);
		
		TaskDTO task = null;
		
		if(taskId.isPresent()) {
			task = taskId.get();
		}
		else{
			// Faculty not found
			throw new RuntimeException("The TaskId you entered is invalid - " + taskId);
		}
		return task;
	}

	@Override
	public void save(TaskDTO task) {
		taskRepository.save(task);
	}

	@Override
	public void deleteById(int id) {
		taskRepository.deleteById(id);

	}

}
