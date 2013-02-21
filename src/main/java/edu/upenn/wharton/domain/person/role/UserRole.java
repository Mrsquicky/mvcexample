package edu.upenn.wharton.domain.person.role;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

import edu.upenn.wharton.domain.security.SecurityRole;

public class UserRole{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId(){
		return id;
	}

	@NotEmpty
	private String title;

	@ManyToMany
	private List<SecurityRole> securityRoles;

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public List<SecurityRole> getSecurityRoles(){
		return securityRoles;
	}

	public void setSecurityRoles(List<SecurityRole> securityRoles){
		this.securityRoles = securityRoles;
	}

	public void addSecurityRole(SecurityRole toAdd){
		getSecurityRoles().add(toAdd);
	}

	public void removeSecurityRole(SecurityRole toRemove){
		getSecurityRoles().remove(toRemove);
	}

	public int getSecurityRoleCount(){
		return getSecurityRoles().size();
	}

	public boolean containsSecurityRole(SecurityRole toFind){
		return getSecurityRoles().contains(toFind);
	}

}
