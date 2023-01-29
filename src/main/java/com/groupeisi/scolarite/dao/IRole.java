package com.groupeisi.scolarite.dao;


import com.groupeisi.scolarite.entities.Roles;

public interface IRole extends IRepository<Roles> {
    public Roles getByNom(String email);
}
