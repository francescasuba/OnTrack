package com.ontrack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ontrack.dto.TaskDTO;

public interface ITaskRepository extends JpaRepository<TaskDTO, Integer> {

}
