package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dao.IUser;
import com.groupeisi.scolarite.dao.UserImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Login", name = "login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUser udao = new UserImpl();
        if(udao.login(req.getParameter("username"), req.getParameter("pass"))!=null) {
            req.setAttribute("success", "Welcome "+req.getParameter("username"));
            req.getRequestDispatcher("vue/Home/index.jsp").forward(req, resp);
        }else {
            req.setAttribute("error", "Login and/or password incorrect!");
            req.getRequestDispatcher("/").forward(req, resp);
        }

    }




    //System.out.println(udao.login(req.getParameter("username"), req.getParameter("pass")));


}
