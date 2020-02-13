package com.timetable.service;

import java.util.List;

import com.timetable.model.Group;
import com.timetable.model.Subject;
import com.timetable.model.Teacher;
import com.timetable.model.Teacher_Subject;

public interface TimetableService {

	public List<Teacher> getAllTeachers();
	
	public List<Subject> getAllSubjects();
	
	public List<Group> getAllGroups();

	public void saveTimetable(Teacher_Subject teacherSubject);
	
}
