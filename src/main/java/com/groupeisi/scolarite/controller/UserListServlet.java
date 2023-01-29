package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dto.UserDto;
import com.groupeisi.scolarite.service.IUserDto;
import com.groupeisi.scolarite.service.UserDtoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/List/User")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUserDto udto = new UserDtoImpl();
        List<UserDto> users = udto.list();

        req.setAttribute("users", users);

            req.getRequestDispatcher("/vue/user/list.jsp").forward(req, resp);
    }
}
