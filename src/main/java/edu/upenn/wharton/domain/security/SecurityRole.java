package edu.upenn.wharton.domain.security;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

public class SecurityRole{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;

	private String value;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Permission> permissions;

	@ManyToMany
	private List<AppUser> users;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getValue(){
		return value;
	}

	public void setValue(String value){
		this.value = value;
	}

	public List<Permission> getPermissions(){
		return permissions;
	}

	public void setPermissions(List<Permission> permissions){
		this.permissions = permissions;
	}

	public void addPermission(Permission toAdd){
		getPermissions().add(toAdd);
	}

	public void removePermission(Permission toRemove){
		getPermissions().remove(toRemove);
	}

	public boolean containsPermission(Permission toFind){
		return getPermissions().contains(toFind);
	}

	public int getPermissionCount(){
		return getPermissions().size();
	}

	public List<AppUser> getUsers(){
		return users;
	}

	public void setUsers(List<AppUser> users){
		this.users = users;
	}

	public void addUser(AppUser toAdd){
		getUsers().add(toAdd);
	}

	public void removeUser(AppUser toRemove){
		getUsers().remove(toRemove);
	}

	public boolean containsUser(AppUser toFind){
		return getUsers().contains(toFind);
	}

	public int getUserCount(){
		return getUsers().size();
	}

	public Long getId(){
		return id;
	}

	public SecurityRole(){
		permissions = new ArrayList<Permission>();
		users = new ArrayList<AppUser>();
	}
}
