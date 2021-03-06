package com.timetable.dao;

import java.util.List;

import com.timetable.model.Teacher;

public interface TeacherDAO {

	public List<Teacher> getTeachers();

	public void saveTeacher(Teacher teacher);

	public Teacher getTeacher(Integer teacherId);
	
}
