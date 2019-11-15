package com.timetable.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id")
	private Integer subjectId;
	@Column(name="subject_name")
	private String subjectName;
	
	public Subject() {

	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}
	
}
