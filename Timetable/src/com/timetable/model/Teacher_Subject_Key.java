package com.timetable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Adding this class as a necessity to the Teacher_Subject table which has a
 * composed key between teacher_id and subject_id
 * 
 * @author ilinca
 *
 */
@Embeddable
public class Teacher_Subject_Key implements Serializable {

	@Column(name = "teacher_id")
	Integer teacherId;
	@Column(name = "subject_id")
	Integer subjectId;

	public Teacher_Subject_Key() {

	}

	public Teacher_Subject_Key(Integer teacherId, Integer subjectId) {
		super();
		this.teacherId = teacherId;
		this.subjectId = subjectId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		result = prime * result + ((teacherId == null) ? 0 : teacherId.hashCode());
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
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		return true;
	}

}
