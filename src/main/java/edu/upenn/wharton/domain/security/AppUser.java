package edu.upenn.wharton.domain.security;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AppUser{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String username;

	@NotNull
	private String password;

	@NotNull
	private boolean enabled;

	@OneToMany
	private List<UserRole> userRoles;
	
	@OneToMany
	private List<SecurityRole> securityRoles;
	
	public Long getId(){
		return id;
	}
	
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
	
}
