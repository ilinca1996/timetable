package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.GroupDAO;
import com.timetable.dao.SubjectDAO;
import com.timetable.dao.TeacherDAO;
import com.timetable.dao.TimetableDAO;
import com.timetable.model.Group;
import com.timetable.model.Subject;
import com.timetable.model.Teacher;
import com.timetable.model.Teacher_Subject;

@Service
public class TimetableServiceImpl implements TimetableService {

	@Autowired
	private TimetableDAO timetableDAO;
	
	@Autowired
	private TeacherDAO teacherDAO;
	
	@Autowired
	private SubjectDAO subjectDAO;
	
	@Autowired
	private GroupDAO groupDAO;
	
	@Override
	@Transactional
	public List<Teacher> getAllTeachers() {
		return teacherDAO.getTeachers();
	}

	@Override
	@Transactional
	public List<Subject> getAllSubjects() {
		return subjectDAO.getSubjects();
	}

	@Override
	@Transactional
	public List<Group> getAllGroups() {
		return groupDAO.getGroups();
	}

	@Override
	@Transactional
	public void saveTimetable(Teacher_Subject teacherSubject) {
		timetableDAO.addTimetable(teacherSubject);
	}

}
