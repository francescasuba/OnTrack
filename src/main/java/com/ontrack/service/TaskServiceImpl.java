package com.ontrack.service;

import java.util.List;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TaskDTO task) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
