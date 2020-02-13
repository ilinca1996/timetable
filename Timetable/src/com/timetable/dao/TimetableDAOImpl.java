package com.timetable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.timetable.model.Teacher_Subject;

@Repository
public class TimetableDAOImpl implements TimetableDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addTimetable(Teacher_Subject teacherSubject) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(teacherSubject);
		
	}

}
