package edu.upenn.wharton.domain.security;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public abstract class Permission{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 3)
	private String name;

	private String description;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public Long getId(){
		return id;
	}

}
