package edu.upenn.wharton.domain.course;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.upenn.wharton.domain.security.AppUser;

public class TestScore{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	@OneToOne
	private AppUser testTaker;

}
