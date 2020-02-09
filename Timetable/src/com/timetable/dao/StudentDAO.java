package com.timetable.dao;

import java.util.List;

import com.timetable.model.Student;

public interface StudentDAO {

	List<Student> getStudents();

	void saveStudent(Student student);

	List<Student> getStudentsByGroup(int groupId);

	Student getStudentById(int studentId);

}
