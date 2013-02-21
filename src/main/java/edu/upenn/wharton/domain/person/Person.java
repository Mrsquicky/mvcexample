package edu.upenn.wharton.domain.person;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import edu.upenn.wharton.domain.person.role.UserRole;

public class Person{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@Email
	private String email;

	@ManyToMany
	private List<UserRole> userRoles;

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public List<UserRole> getUserRoles(){
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles){
		this.userRoles = userRoles;
	}

	public void addUserRole(UserRole toAdd){
		getUserRoles().add(toAdd);
	}

	public void removeUserRole(UserRole toRemove){
		getUserRoles().remove(toRemove);

	}

	public int getUserRoleCount(){
		return getUserRoles().size();
	}

	public boolean containsUserRole(UserRole toFind){
		return getUserRoles().contains(toFind);
	}

}
