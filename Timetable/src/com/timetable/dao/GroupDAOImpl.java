package com.timetable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.timetable.model.Group;
import com.timetable.model.Student;

@Repository
public class GroupDAOImpl implements GroupDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Group> getGroups() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Group> theQuery = currentSession.createQuery("from Group order by year", Group.class);
		List<Group> groups = theQuery.getResultList();
		
		return groups;
	}

	@Override
	public void saveGroup(Group group) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(group);

	}

}
