package com.timetable.service;

import java.util.List;
import java.util.Map;

import com.timetable.model.Student;

public interface StudentService {

	List<Student> getStudents();

	void saveStudent(Student student);

	Map<Integer, Integer> getGroups();

	List<Student> getStudentsByGroup(int groupId);

	Student getStudent(int studentId);

}
