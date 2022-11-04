package com.ontrack;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ontrack.dto.TaskDTO;

@Controller
@RequestMapping("/Tasks")
public class OnTrackController {
	
	private List<TaskDTO> tasks;
	
	@PostConstruct
	private void loadData() {
		// Temporary hard-coded task data
			TaskDTO task1 = new TaskDTO(1, "Math Exam", "To Do", "Exam for math class", "10/31/2022");
			TaskDTO task2 = new TaskDTO(2, "Art Project", "In Progress", "Project for art class", "10/31/2022");
			TaskDTO task3 = new TaskDTO(3, "Essay", "Done", "Essay for english class", "10/31/2022");
			
			// create list
			tasks = new ArrayList();
			
			//Add tasks to list
			tasks.add(task1);
			tasks.add(task2);
			tasks.add(task3);
	}
	
	//mapping for "/list"
	@GetMapping("/list")
	public String listTasks(Model model) {
		// Add tasks to model
		model.addAttribute("tasks", tasks);
		
		return "index";
	}

}
