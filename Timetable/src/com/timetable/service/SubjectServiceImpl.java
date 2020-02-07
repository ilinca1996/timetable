package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timetable.dao.SubjectDAO;
import com.timetable.model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

	//Inject the DAO classes
	@Autowired
	private SubjectDAO subjectDAO;
	
	@Override
	@Transactional
	public List<Subject> getSubjects() {
		return subjectDAO.getSubjects();
	}

	@Override
	@Transactional
	public void saveSubject(Subject subject) {		
		subjectDAO.saveSubject(subject);	
	}

	@Override
	@Transactional
	public Subject getSubject(int subjectId) {
		return subjectDAO.getSubject(subjectId);
	}

}
