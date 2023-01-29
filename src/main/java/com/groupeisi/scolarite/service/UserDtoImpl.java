package com.groupeisi.scolarite.service;

import com.groupeisi.scolarite.dao.UserImpl;
import com.groupeisi.scolarite.dto.UserDto;
import com.groupeisi.scolarite.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDtoImpl implements IUserDto {

	private UserImpl udao = new UserImpl();
	@Override
	public int add(UserDto userDto) {

		return udao.add(udao.UserDtoToUserEntity(userDto));
	}

	@Override
	public int delete(int id) {

		return udao.delete(id, new User());
	}

	@Override
	public int update(UserDto userDto) {

		return udao.update(udao.UserDtoToUserEntity(userDto));
	}

	@Override
	public List<UserDto> list() {
		List<UserDto> userDtos = new ArrayList<UserDto>();
		udao.list(new User()).forEach(role -> {
			userDtos.add(udao.UserEntityToUserDto(role));
		});
		return userDtos;
	}

	@Override
	public UserDto get(int id) {

		return udao.UserEntityToUserDto(udao.get(id, new User()));
	}

}
