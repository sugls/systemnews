package com.hzgg.systemnews.adminmanage.servlet;

import com.hzgg.systemnews.adminmanage.dao.IAdminDAO;
import com.hzgg.systemnews.adminmanage.vo.Admins;
import com.hzgg.systemnews.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by lsc on 2017/1/12 9:53.
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/admin/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String userpwd = request.getParameter("passwd");

        String url;
        HttpSession session =  request.getSession();
        IAdminDAO adminDAO = (IAdminDAO) DaoFactory.getInstance("admin");
        Admins admin = adminDAO.checkLogin(username,userpwd);
        if (admin!=null){
            session.setAttribute("admin",admin);
            url = "main.jsp";
        } else {
            request.setAttribute("error","用户名或密码错误");
            url = "login.jsp";
        }

        adminDAO = null;   // 释放对象

        request.getRequestDispatcher(url).forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
