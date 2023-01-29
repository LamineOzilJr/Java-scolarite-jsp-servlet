package com.groupeisi.scolarite.dao;

import com.groupeisi.scolarite.entities.User;

public interface IUser extends IRepository<User> {
    public User login(String email, String password);
    public User getByEmail(String email);
}
