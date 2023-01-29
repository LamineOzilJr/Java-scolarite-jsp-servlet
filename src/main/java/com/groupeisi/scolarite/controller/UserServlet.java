package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dao.IRole;
import com.groupeisi.scolarite.dao.IUser;
import com.groupeisi.scolarite.dao.RoleImpl;
import com.groupeisi.scolarite.dao.UserImpl;
import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.dto.UserDto;
import com.groupeisi.scolarite.entities.Roles;
import com.groupeisi.scolarite.entities.User;
import com.groupeisi.scolarite.service.IRoleDto;
import com.groupeisi.scolarite.service.IUserDto;
import com.groupeisi.scolarite.service.RoleDtoImpl;
import com.groupeisi.scolarite.service.UserDtoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/User", name = "user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoleDto rdto = new RoleDtoImpl();
        RoleDto r = new RoleDto();
        List<RoleDto> list = rdto.list();
        req.setAttribute("roles", list);

            req.getRequestDispatcher("/vue/user/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUserDto udto = new UserDtoImpl();
        UserDto u = new UserDto();
        u.setEmail(req.getParameter("email"));
        u.setPassword(req.getParameter("password"));
        List<RoleDto> rolesList = new ArrayList<>();
        IRoleDto rdto = new RoleDtoImpl();
        RoleDto r = new RoleDto();
        List<RoleDto> roles = rdto.list();
        String result  = req.getParameter("roles");
        for (RoleDto newr: roles) {
            if (newr.getId() == Integer.parseInt(result)){
                rolesList.add(newr);
                break;
            }
        }

        u.setRoles(rolesList);

        if (udto.add(u)==1){
            req.setAttribute("success", "User ajouté avec succes!");
            doGet(req, resp);
        }
    }
}

