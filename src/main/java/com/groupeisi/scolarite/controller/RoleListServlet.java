package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.service.IRoleDto;
import com.groupeisi.scolarite.service.RoleDtoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/List/Role")
public class RoleListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoleDto rdto = new RoleDtoImpl();
        List<RoleDto> roles = rdto.list();

        req.setAttribute("roles", roles);
//        HttpSession session=req.getSession();
//        if(session.getAttribute("user")==null) {
//            req.setAttribute("error", "Vous devez vous connecter d'abord!");
//            req.getRequestDispatcher("/vue/login/index.jsp").forward(req, resp);
//        }else
            req.getRequestDispatcher("/vue/role/list.jsp").forward(req, resp);
    }
}
