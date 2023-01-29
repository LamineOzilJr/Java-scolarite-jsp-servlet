package com.groupeisi.scolarite.dto;

import java.util.ArrayList;
import java.util.List;


public class RoleDto {

	private int id;
	private String name;
	private List<String> users = new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}

	public RoleDto() {
	}

	public RoleDto(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
