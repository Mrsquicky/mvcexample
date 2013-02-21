package edu.upenn.wharton.domain.course;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

public class CourseTest{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	@NotEmpty
	private String title;

	@ManyToOne
	private Course course;

	@OneToOne
	private CourseMeeting meeting;

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public Course getCourse(){
		return course;
	}

	public void setCourse(Course course){
		this.course = course;
	}

	public CourseMeeting getMeeting(){
		return meeting;
	}

	public void setMeeting(CourseMeeting meeting){
		this.meeting = meeting;
	}

}
