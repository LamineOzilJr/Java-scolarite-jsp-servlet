package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dao.IRole;
import com.groupeisi.scolarite.dao.IUser;
import com.groupeisi.scolarite.dao.RoleImpl;
import com.groupeisi.scolarite.dao.UserImpl;
import com.groupeisi.scolarite.entities.Roles;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/Role", name = "role")
public class RoleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session=req.getSession();
//        if(session.getAttribute("user")==null) {
//            req.setAttribute("error", "Vous devez vous connecter d'abord pour acceder a cette page!");
//            req.getRequestDispatcher("/vue/login/index.jsp").forward(req, resp);
//        }else {
            req.getRequestDispatcher("/vue/role/add.jsp").forward(req, resp);
        //}
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRole rdao = new RoleImpl();
        Roles r = new Roles();
        r.setName(req.getParameter("name"));
        if (rdao.add(r)==1)
            req.setAttribute("success", "Role ajouté avec succes!");
    }
}
