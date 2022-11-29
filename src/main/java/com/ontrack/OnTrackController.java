package com.ontrack;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		return "tasks/index";
	}
	
	@GetMapping("/viewAddForm")
	public String viewAddForm(Model model) {
		// Model attribute for data binding
		TaskDTO task = new TaskDTO();
		model.addAttribute("task", task);
		
		return "tasks/add-task-form";
	}
	
	@PostMapping("/save")
	public String saveFaculty(@ModelAttribute("task") TaskDTO task) {
		// Save task
		taskService.save(task);
		
		// Block duplicate submission on accidental refresh
		return "redirect:/Tasks/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("taskId") int id) {
		
		//Remove task
		taskService.deleteById(id);
		
		//return to 
		return "redirect:/Tasks/list";
		
	}

}
