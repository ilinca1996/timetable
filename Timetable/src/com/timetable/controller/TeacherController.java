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

	@GetMapping("/showFormForAddTeacher")
	public String showFormForAdd(Model theModel) {
		
		Teacher teacher = new Teacher();
		theModel.addAttribute("teacher", teacher);
		
		return "teacher-form";
	}
	
	@PostMapping("/saveTeacher")
	public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
		
		teacherService.saveTeacher(teacher);
		
		return "redirect:/teacher/list";
	}
	
	@GetMapping("/showFormForUpdateTeacher")
	public String showFormForUpdate(@RequestParam("teacherId") Integer teacherId, Model theModel) {
		
		Teacher teacher = teacherService.getTeacher(teacherId);
		theModel.addAttribute("teacher", teacher);
		
		return "teacher-form";
		
	}
	
}
