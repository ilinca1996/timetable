package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timetable.model.Teacher;
import com.timetable.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/list")
	public String listTeachers(Model model) {
		
		List<Teacher> teachers = teacherService.getTeachers();
		model.addAttribute("teachers", teachers);
		
		return "list-teachers";
	}
	
}
