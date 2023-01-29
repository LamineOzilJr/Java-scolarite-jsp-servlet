package com.groupeisi.scolarite.service;

import com.groupeisi.scolarite.dto.UserDto;

import java.util.List;

public interface IUserDto {

	public int add(UserDto userDto);
	public int delete(int id);
	public int update(UserDto userDto);
	public List<UserDto> list();
	public UserDto get(int id);
}
