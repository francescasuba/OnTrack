package com.ontrack.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ontrack.dto.TaskDTO;

public interface ITaskRepository extends JpaRepository<TaskDTO, Integer> {
	
	public List<TaskDTO> findAllByOrderByName();

}
