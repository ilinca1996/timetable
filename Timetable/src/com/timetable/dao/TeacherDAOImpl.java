package com.timetable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.timetable.model.Teacher;

@Repository
public class TeacherDAOImpl implements TeacherDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Teacher> getTeachers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Teacher> query = currentSession.createQuery("from Teacher order by lastName", Teacher.class);
		List<Teacher> teachers = query.getResultList();
		
		return teachers;
	}

	@Override
	public void saveTeacher(Teacher teacher) {

		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//Save the teacher
		currentSession.saveOrUpdate(teacher);
		
	}

	@Override
	public Teacher getTeacher(Integer teacherId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Teacher teacher = currentSession.get(Teacher.class, teacherId);
		
		return teacher;
	}

}
