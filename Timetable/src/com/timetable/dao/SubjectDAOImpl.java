package com.timetable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.timetable.model.Subject;

@Repository
public class SubjectDAOImpl implements SubjectDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Subject> getSubjects() {
		
		//get the current hibernate Session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the query
		Query<Subject> theQuery = currentSession.createQuery("from Subject", Subject.class);
		
		//execute the query and retrive the result
		List<Subject> subjects = theQuery.getResultList();
		
		return subjects;
	}

}
