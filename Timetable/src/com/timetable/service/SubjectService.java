package com.timetable.service;

import java.util.List;

import com.timetable.model.Subject;

public interface SubjectService {

	public List<Subject> getSubjects();

	public void saveSubject(Subject subject);

	public Subject getSubject(int subjectId);
	
}
