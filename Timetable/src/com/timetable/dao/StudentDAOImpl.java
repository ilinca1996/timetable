package com.timetable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.timetable.model.Student;
import com.timetable.model.Subject;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Student> theQuery = session.createQuery("from Student order by lastName", Student.class);
		
		return theQuery.getResultList();
	}

	@Override
	public void saveStudent(Student student) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		
	}

	@Override
	public List<Student> getStudentsByGroup(int groupId) {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Student> theQuery = session.createQuery("from Student s where s.group=" + groupId + " order by lastName", Student.class);
		
		return theQuery.getResultList();
	}

	@Override
	public Student getStudentById(int studentId) {
		
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, studentId);
		
		return student;
	}

}
