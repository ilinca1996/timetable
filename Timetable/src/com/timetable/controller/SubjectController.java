package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.timetable.model.Subject;
import com.timetable.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {

	//inject the Subject Service
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/list")
	public String listSubjects(Model theModel) {
		
		//get the subjects from DAO
		List<Subject> subjects = subjectService.getSubjects();
		
		//add the subjects to the model
		theModel.addAttribute("subjects", subjects);
		
		return "list-subjects";
		
	}
	
	@GetMapping("/showFormForAddSubject")
	public String showFormForAdd(Model theModel) {
		
		Subject subject = new Subject();
		theModel.addAttribute("subject", subject);
		
		return "subject-form";
	}
	
	@PostMapping("/saveSubject")
	public String saveSubject(@ModelAttribute("subject") Subject subject) {
		
		//Save the subject using the service layer
		subjectService.saveSubject(subject);
		
		return "redirect:/subject/list";
	}
	
	@GetMapping("/showFormForUpdateSubject") 
	public String showFormForUpdate(@RequestParam("subjectId") int subjectId, Model theModel) {
		
		//Get the subject from the service
		Subject subject = subjectService.getSubject(subjectId);
		
		//Set subject as a model attribute to populate the form
		theModel.addAttribute("subject", subject);
		
		//Send it to the form
		return "subject-form";
	}
	
}
