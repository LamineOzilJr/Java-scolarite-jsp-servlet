package com.groupeisi.scolarite.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

	private int id;
	private String email;
	private String password;
	private List<RoleDto> roles = new ArrayList<RoleDto>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}

}
