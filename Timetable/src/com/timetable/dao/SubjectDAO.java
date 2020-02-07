package com.timetable.dao;

import java.util.List;

import com.timetable.model.Subject;

public interface SubjectDAO {

	public List<Subject> getSubjects();

	public void saveSubject(Subject subject);

	public Subject getSubject(int subjectId);
	
}
