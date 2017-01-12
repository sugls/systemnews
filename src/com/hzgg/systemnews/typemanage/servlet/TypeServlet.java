package com.hzgg.systemnews.typemanage.servlet;

import com.hzgg.systemnews.typemanage.dao.ITypeDAO;
import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 新闻类别管理控制器
 * Created by lsc on 2017/1/12 10:04.
 */
@WebServlet(name = "TypeServlet",urlPatterns = "/admin/type")
public class TypeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String option = req.getParameter("option");
        String typename = req.getParameter("typename");
        String target = null;
        ITypeDAO typeDAO = (ITypeDAO) DaoFactory.getInstance("type");

        if ("addlink".equals(option)){
            target = "typeadd.jsp";
        }else if ("addtype".equals(option)){
            NewsTypes type = new NewsTypes();
            type.setTypename(typename);
            String info;
            if (typeDAO.insertType(type)){
                info = "新闻类别添加成功";
            }else {
                info = "新闻类别添加失败";
            }
            req.setAttribute("info",info);
            target = "typeadd.jsp";
        }

        req.getRequestDispatcher(target).forward(req,resp);
    }
}
