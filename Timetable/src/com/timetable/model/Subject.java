package com.timetable.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	//To be check - i don't think it's correct in this case
	
		@ManyToMany
		@JoinTable(name="teacher_subject",
		joinColumns=@JoinColumn(name="subject_id"),
		inverseJoinColumns=@JoinColumn(name="teacher_id"))
	private List<Teacher> teachers;
	
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
