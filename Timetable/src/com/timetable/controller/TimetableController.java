package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timetable.model.Group;
import com.timetable.model.Subject;
import com.timetable.model.Teacher;
import com.timetable.model.Teacher_Subject;
import com.timetable.service.TimetableService;

@Controller
@RequestMapping("/timetable")
public class TimetableController {
	
	@Autowired
	private TimetableService timetableService;
	
	@GetMapping("/selectTeacherForTimetable")
	public String selectTeacher(Model theModel) {
		
		List<Teacher> teachers = timetableService.getAllTeachers();
		theModel.addAttribute("teachers", teachers);
		theModel.addAttribute("teacherSubject", new Teacher_Subject());
		
		return "select-teacher-timetable";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		//Create a Teacher_Subject object
		Teacher_Subject teacherSubject = new Teacher_Subject();
		
		//Return all teachers
		List<Teacher> teachers = timetableService.getAllTeachers();
		
		//Return all the subjects
		List<Subject> subjects = timetableService.getAllSubjects();
		
		//Retrive all groups
		List<Group> groups = timetableService.getAllGroups();
		
		//Add in the model also the teacher (findById)
		theModel.addAttribute("teacherSubject", teacherSubject);
		theModel.addAttribute("teachers", teachers);
		theModel.addAttribute("subjects", subjects);
		theModel.addAttribute("groups", groups);
		
		return "set-timetable-form";
		
	}
	
	@PostMapping("/saveTimetable")
	public String saveTimetable(@ModelAttribute("teacherSubject") Teacher_Subject teacherSubject) {
		
		timetableService.saveTimetable(teacherSubject);
		
		return "redirect:/teacher/list";
	}

}
