package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
