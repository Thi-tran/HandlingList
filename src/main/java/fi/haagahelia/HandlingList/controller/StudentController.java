package fi.haagahelia.HandlingList.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.HandlingList.domain.Student;

@Controller

public class StudentController {
	
	@RequestMapping("/hello")
	public String greeting(Model model) {
		
	    ArrayList<Student> studentList=new ArrayList<Student>();  
	    
	   
		studentList.add(new Student("Kate", "Cole"));
		studentList.add(new Student("Dan", "Brown"));
		studentList.add(new Student("Mike", "Mars"));
		
		model.addAttribute("studentList", studentList);
		return "hello";
	}

}
