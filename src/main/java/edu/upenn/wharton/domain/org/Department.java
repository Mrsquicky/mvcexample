package edu.upenn.wharton.domain.org;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import edu.upenn.wharton.domain.course.Course;

@Entity
public class Department{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Size(min = 3)
	private String title;

	@OneToMany
	private List<Course> courses;

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public List<Course> getCourses(){
		return courses;
	}

	public void setCourses(List<Course> courses){
		this.courses = courses;
	}

	public Integer getId(){
		return id;

	}

	public void addCourse(Course toAdd){
		getCourses().add(toAdd);
	}

	public void removeCourse(Course toRemove){
		getCourses().remove(toRemove);
	}

	public int getCourseCount(){
		return getCourses().size();
	}

	public boolean containsCourse(Course toFind){
		return getCourses().contains(toFind);
	}

}
