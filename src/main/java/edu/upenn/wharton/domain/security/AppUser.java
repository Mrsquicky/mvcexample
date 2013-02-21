package edu.upenn.wharton.domain.security;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import edu.upenn.wharton.domain.person.Person;

@Entity
public class AppUser extends Person{

	@NotNull
	@Size(min = 3)
	private String username;

	@NotNull
	private String password;

	@NotNull
	private boolean enabled;

	@ManyToMany
	private List<SecurityRole> securityRoles;

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public boolean isEnabled(){
		return enabled;
	}

	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	public List<SecurityRole> getSecurityRoles(){
		return securityRoles;
	}

	public void setSecurityRoles(List<SecurityRole> SecurityRoles){
		this.securityRoles = SecurityRoles;
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
