package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.SubjectDAO;
import com.timetable.dao.TeacherDAO;
import com.timetable.model.Subject;
import com.timetable.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	//Inject the DAO classes
	@Autowired
	private TeacherDAO teacherDAO;
	
	@Autowired
	private SubjectDAO subjectsDAO;
	
	@Override
	@Transactional
	public List<Teacher> getTeachers() {
		return teacherDAO.getTeachers();
	}

	@Override
	@Transactional
	public void saveTeacher(Teacher teacher) {
		 teacherDAO.saveTeacher(teacher);
	}

	@Override
	@Transactional
	public Teacher getTeacher(Integer teacherId) {
		return teacherDAO.getTeacher(teacherId);
	}

	@Override
	@Transactional
	public List<Subject> getSubjects() {
		return subjectsDAO.getSubjects();
	}

}
