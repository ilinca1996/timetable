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
		
		//create the query - sort by subject name
		Query<Subject> theQuery = currentSession.createQuery("from Subject order by subjectName", Subject.class);
		
		//execute the query and retrive the result
		List<Subject> subjects = theQuery.getResultList();
		
		return subjects;
	}

	@Override
	public void saveSubject(Subject subject) {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//checks if the subject is already in the database, if not is inserting it, else updating the info
		currentSession.saveOrUpdate(subject);
	}

	@Override
	public Subject getSubject(int subjectId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Subject subject = currentSession.get(Subject.class, subjectId);
		
		return subject;
	}

}
