package com.groupeisi.scolarite.test;

import com.groupeisi.scolarite.dao.IRole;
import com.groupeisi.scolarite.dao.RoleImpl;
import com.groupeisi.scolarite.entities.Roles;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
    private static Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args){
        Roles r = new Roles();
        r.setName("Testeur");
        IRole rdao = new RoleImpl();
        int result = rdao.add(r);
        BasicConfigurator.configure();
        logger.debug(result);
    }
}
