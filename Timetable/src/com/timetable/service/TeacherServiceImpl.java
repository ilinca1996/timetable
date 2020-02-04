package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.TeacherDAO;
import com.timetable.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	//Inject the DAO classes
	@Autowired
	private TeacherDAO teacherDAO;
	
	@Override
	@Transactional
	public List<Teacher> getTeachers() {
		return teacherDAO.getTeachers();
	}

}
