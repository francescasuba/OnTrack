package com.ontrack;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ontrack.dto.TaskDTO;
import com.ontrack.service.ITaskService;

@Controller
@RequestMapping("/Tasks")
public class OnTrackController {
	
	public ITaskService taskService;
	
	public OnTrackController (ITaskService theTaskService) {
		taskService = theTaskService;
	}
	
	//mapping for "/list"
	@GetMapping("/list")
	public String listTasks(Model model) {
		//Retrieve tasks from database
		List<TaskDTO> tasks = taskService.findAll();
		// Add tasks to model
		model.addAttribute("tasks", tasks);
		
		return "index";
	}

}
