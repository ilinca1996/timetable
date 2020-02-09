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

import com.timetable.model.Group;
import com.timetable.model.Student;
import com.timetable.service.GroupService;

@Controller
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	@GetMapping("/list")
	public String listGroups(Model theModel) {
		
		List<Group> groups = groupService.getGroups();
		theModel.addAttribute("groups", groups);
		
		return "list-groups";
	}
	
	@GetMapping("showFormForAddGroup")
	public String showFormForAdd(Model theModel) {
		
		Group group = new Group();
		theModel.addAttribute("group", group);
		
		return "group-form";
	}
	
	@PostMapping("/saveGroup")
	public String saveGroup(@ModelAttribute("group") Group group) {
		
		groupService.saveGroup(group);
		
		return "redirect:/group/list";
	}
	
}
