package edu.upenn.wharton.domain.security;

import java.util.HashSet;
import java.util.Set;

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
	private Set<Authority> authorities;

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

	public Set<Authority> getAuthorities(){
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities){
		this.authorities = authorities;
	}

	public AppUser(){
		setAuthorities(new HashSet<Authority>());
	}
}
