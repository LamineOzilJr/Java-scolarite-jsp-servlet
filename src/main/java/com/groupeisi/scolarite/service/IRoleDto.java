package com.groupeisi.scolarite.service;

import com.groupeisi.scolarite.dto.RoleDto;

import java.util.List;

public interface IRoleDto {

	public int add(RoleDto roleDto);
	public int delete(int id);
	public int update(RoleDto roleDto);
	public List<RoleDto> list();
	public RoleDto get(int id);
}
