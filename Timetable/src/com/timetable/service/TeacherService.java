package com.timetable.service;

import java.util.List;

import com.timetable.model.Teacher;

public interface TeacherService {

	public List<Teacher> getTeachers();

	public void saveTeacher(Teacher teacher);

	public Teacher getTeacher(Integer teacherId);
	
}
