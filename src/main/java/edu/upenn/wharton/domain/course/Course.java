package edu.upenn.wharton.domain.course;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NaturalId;

import edu.upenn.wharton.domain.org.Department;

public class Course{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	@NotNull
	private String title;

	@NaturalId
	private String code;

	@ManyToOne
	private Department department;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Temporal(TemporalType.TIME)
	private Date endTime;

	private String daysCode;

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}

	public Department getDepartment(){
		return department;
	}

	public void setDepartment(Department department){
		this.department = department;
		this.department.addCourse(this);
	}

	public Date getStartDate(){
		return startDate;
	}

	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}

	public Date getEndDate(){
		return endDate;
	}

	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}

	public Date getStartTime(){
		return startTime;
	}

	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}

	public Date getEndTime(){
		return endTime;
	}

	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}

	public String getDaysCode(){
		return daysCode;
	}

	public void setDaysCode(String daysCode){
		this.daysCode = daysCode;
	}
}
