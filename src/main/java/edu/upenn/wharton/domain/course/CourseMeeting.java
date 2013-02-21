package edu.upenn.wharton.domain.course;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

public class CourseMeeting{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	private Course course;

	private DateTime meetingTime;

	public Course getCourse(){
		return course;
	}

	public void setCourse(Course course){
		this.course = course;
	}

	public DateTime getMeetingTime(){
		return meetingTime;
	}

	public void setMeetingTime(DateTime meetingTime){
		this.meetingTime = meetingTime;
	}

}
