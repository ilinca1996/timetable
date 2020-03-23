package com.timetable.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Adding this class as a necessity to the Teacher_Subject table which has a
 * composed key between teacher_id and subject_id
 * 
 * @author ilinca
 *
 */
@Embeddable
public class Teacher_Subject_Key implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_id", nullable = false, insertable = false, updatable = false)
	private Teacher teacher;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subject_id", nullable = false, insertable = false, updatable = false)
	private Subject subject;

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

	public Teacher_Subject_Key() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher_Subject_Key other = (Teacher_Subject_Key) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		return true;
	}
	
//	@Column(name = "teacher_id")
//	Integer teacherId;
//	@Column(name = "subject_id")
//	Integer subjectId;
	


}
