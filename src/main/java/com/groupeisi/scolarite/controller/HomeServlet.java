package com.groupeisi.scolarite.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/Home", name = "home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session=req.getSession();
//        if(session.getAttribute("user")==null) {
//            req.setAttribute("error", "Vous devez vous connecter d'abord!");
//            req.getRequestDispatcher("/login/index.jsp").forward(req, resp);
//        }else {
            req.getRequestDispatcher("vue/Home/index.jsp").forward(req, resp);
        //}
    }
}
