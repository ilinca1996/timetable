package com.timetable.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_subject")
public class Teacher_Subject {

	@OneToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	@OneToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	private Period period;
	private Group group;
	
	public Teacher_Subject() {

	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Teacher_Subject(Teacher teacher, Subject subject, Period period, Group group) {
		super();
		this.teacher = teacher;
		this.subject = subject;
		this.period = period;
		this.group = group;
	}
	
}
