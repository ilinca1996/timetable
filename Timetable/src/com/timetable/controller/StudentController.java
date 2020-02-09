package com.timetable.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.timetable.model.Group;
import com.timetable.model.Student;
import com.timetable.model.Subject;
import com.timetable.service.GroupService;
import com.timetable.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public String listStudents(Model theModel) {

		List<Student> students = studentService.getStudents();
		theModel.addAttribute("students", students);

		return "list-students";
	}

	@GetMapping("/showFormForAddStudent")
	public String showFormForAdd(Model theModel) {

		Student student = new Student();
		Map<Integer, Integer> groups = studentService.getGroups();
		theModel.addAttribute("student", student);
		theModel.addAttribute("groups", groups);

		return "student-form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {

		studentService.saveStudent(student);

		return "redirect:/student/list";
	}

	@GetMapping("/showFormForUpdateStudent")
	public String showFormForUpdate(@RequestParam("studentId") int studentId, Model theModel) {

		// Get the student from the service
		Student student = studentService.getSubject(studentId);

		// Set student as a model attribute to populate the form
		theModel.addAttribute("student", student);

		// Send it to the form
		return "student-form";

	}

	@GetMapping("/showFormForGroupStudents")
	public String showGroupStudents(@RequestParam("groupId") int groupId, Model theModel) {

		List<Student> students = studentService.getStudentsByGroup(groupId);
		theModel.addAttribute("students", students);
		theModel.addAttribute("groupId", groupId);

		return "list-students-by-group";
	}

}
