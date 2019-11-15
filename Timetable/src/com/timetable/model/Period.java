package com.timetable.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="time_period")
public class Period {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="period_id")
	private Integer periodId;
	@Column(name="day")
	private String day;
	@Column(name="start_time")
	private Calendar startTime;
	@Column(name="end_time")
	private Calendar endTime;
	
	public Period(String day, Calendar startTime, Calendar endTime) {
		super();
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Period() {

	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}

	public Integer getPeriodId() {
		return periodId;
	}
	
}
