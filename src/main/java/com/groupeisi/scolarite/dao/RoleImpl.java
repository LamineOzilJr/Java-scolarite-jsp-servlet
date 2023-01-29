package com.groupeisi.scolarite.dao;

import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.entities.Roles;
import com.groupeisi.scolarite.entities.User;

import java.util.ArrayList;
import java.util.List;

public class RoleImpl extends RepositoryImpl<Roles> implements IRole{
    @Override
    public Roles getByNom(String name) {

        return (Roles) session.createQuery("FROM Roles role WHERE role.name = :role_name")
                .setParameter("role_name", name).uniqueResult();
    }

    public Roles RoleDtoToAppRoleEntity (RoleDto roleDto) {
        Roles role = new Roles();
        role.setId(roleDto.getId());
        role.setName(roleDto.getName());
        if (roleDto.getUsers() != null) {
            List<User> users = new ArrayList<User>();
            roleDto.getUsers().forEach(email->{
                User user = new UserImpl().getByEmail(email);
                users.add(user);
            });
            role.setUsers(users);
        }
        return role;
    }
    public RoleDto RoleEntityToAppRoleDto (Roles role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        if (role.getUsers() != null) {
            List<String> emailUsers = new ArrayList<String>();
            role.getUsers().forEach(user->{
                emailUsers.add(user.getEmail());
            });
            roleDto.setUsers(emailUsers);
        }
        return roleDto;
    }
}
