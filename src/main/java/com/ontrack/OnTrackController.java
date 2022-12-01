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
	/**
	 * It seems you forgot to tell the person running the instructions of how to set up the database. 
	 * 1. create database on phpMyAdmin "ontrack"
	 * 2. then make a table named "tasks"
	 * 3. there will be 5 columns that will have to be made. ->"id" !important add auto increment,"name","type","description","due_date"
	 * 4. Then add information wanted on this table
	 * @param model
	 * @return
	 */
	//mapping for "/list"
	@GetMapping("/list")
	public String listTasks(Model model) {
		//Retrieve tasks from database
		List<TaskDTO> tasks = taskService.findAll();
		// Add tasks to model
		model.addAttribute("tasks", tasks);
		
		return "tasks/index";
	}
	/**
	 * I like this but you should be able to move the task to the to-do to in progress and done. 
	 * I believe we recently got the logic last Thursday and I think it can bee added easily.
	 * @param model
	 * @return
	 */
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
	
	@GetMapping("/viewUpdateForm")
	public String  viewUpdateForm(@RequestParam("taskId") int id, Model Model) {
		
		
		//Retrieve TASK info from service layer
		TaskDTO task = taskService.findById(id);

	
		Model.addAttribute("task", task);
		
		//redirect us to the ADD form
		return "tasks/add-task-form";
		
	}

	
	@GetMapping("/delete")
	public String delete(@RequestParam("taskId") int id) {
		
		//Remove task
		taskService.deleteById(id);
		
	
		return "redirect:/Tasks/list";
		
	}

}
