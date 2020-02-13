package com.timetable.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.GroupDAO;
import com.timetable.dao.StudentDAO;
import com.timetable.model.Group;
import com.timetable.model.Student;
import com.timetable.model.Subject;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private GroupDAO groupDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	@Transactional
	public Map<Integer, Integer> getGroups() {
		return groupDAO.getGroups().stream().collect(Collectors.toMap(Group::getGroupId, Group::getGroupNumber));
	}

	@Override
	@Transactional
	public List<Student> getStudentsByGroup(int groupId) {
		return studentDAO.getStudentsByGroup(groupId);
	}

	@Override
	@Transactional
	public Student getStudent(int studentId) {
		return studentDAO.getStudentById(studentId);
	}

}
