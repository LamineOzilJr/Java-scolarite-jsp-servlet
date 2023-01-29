package com.groupeisi.scolarite.dao;

import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.dto.UserDto;
import com.groupeisi.scolarite.entities.Roles;
import com.groupeisi.scolarite.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserImpl extends RepositoryImpl<User> implements IUser {

    @Override
    public User getByEmail(String email) {

        //return (AppUser) session.get(AppUser.class, email); //A revoir
        return (User) session.createQuery("FROM User user WHERE user.email = :user_email")
                .setParameter("user_email", email).uniqueResult();
    }

    @Override
    public User login(String email, String password) {
        List<User> users = new ArrayList<>();
        User i = new User();
        users = this.list(i);
        for (User ing : users) {
            if(ing.getEmail().equals(email) && ing.getPassword().equals(password)) {
                return ing;
            }
        }
        return null;
    }
    public User UserDtoToUserEntity (UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        if (userDto.getRoles() != null) {
            List<Roles> roles = new ArrayList<Roles>();
            userDto.getRoles().forEach(name->{
                Roles role = new RoleImpl().getByNom(name.getName());
                roles.add(role);
            });
            user.setRoles(roles);
        }
        user.setPassword(userDto.getPassword());
        return user;
    }
    public UserDto UserEntityToUserDto (User user) {
        UserDto userdto = new UserDto();
        userdto.setId(user.getId());
        userdto.setEmail(user.getEmail());
        if (user.getRoles() != null) {
            List<RoleDto> nomRoles = new ArrayList<RoleDto>();
            user.getRoles().forEach(roles->{
                nomRoles.add(new RoleDto(roles.getId(), roles.getName()) );
            });
            userdto.setRoles(nomRoles);
        }

        return userdto;
    }
}
