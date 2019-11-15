package com.timetable.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class_group")
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	private Integer groupId;
	@Column(name="group_number")
	private Integer groupNumber;
	@Column(name="group_number")
	private Integer year;
	private List<Student> students;
	
	public Integer getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Integer getGroupId() {
		return groupId;
	}
	
	public Group() {

	}
	
	public Group(Integer groupNumber, Integer year) {
		super();
		this.groupNumber = groupNumber;
		this.year = year;
	}
	
}
