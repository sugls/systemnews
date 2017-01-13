package com.hzgg.systemnews.typemanage.servlet;

import com.hzgg.systemnews.typemanage.dao.ITypeDAO;
import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 * 新闻类别管理控制器
 * Created by lsc on 2017/1/12 10:04.
 */
@WebServlet(name = "TypeServlet",urlPatterns = "/admin/type")
public class TypeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        String typename = req.getParameter("typename");
        String typeid = req.getParameter("id");
        String target = null;
        String info;
        HttpSession session = req.getSession();

        ITypeDAO typeDAO = (ITypeDAO) DaoFactory.getInstance("type");

        if ("addlink".equals(option)){
            target = "typeadd.jsp";
        }else if ("addtype".equals(option)){
            NewsTypes type = new NewsTypes();
            type.setTypename(typename);
            if (typeDAO.insertType(type)){
                info = "新闻类别添加成功";
                session.removeAttribute("types");
            }else {
                info = "新闻类别添加失败";
            }
            req.setAttribute("info",info);
            target = "typeadd.jsp";
        }else if ("showtype".equals(option)){
            List<NewsTypes> types = (List<NewsTypes>) session.getAttribute("types");
            if (types==null){
                types = typeDAO.getTypes();
                if (types.size()>0){
                    session.setAttribute("types",types);
                }
            }
            target = "typelist.jsp";
        } else if ("onetype".equals(option)){
          req.setAttribute("type",typeDAO.getTypeById(Integer.parseInt(typeid)));
          target = "typeedit.jsp";
        } else if ("edittype".equals(option)){
            if (typeDAO.updateType(typeDAO.getTypeById(Integer.parseInt(typeid)))){
                info = "类别修改成功";
                session.removeAttribute("types");
            }else {
                info = "类别修改失败";
            }
            req.setAttribute("info",info);
            target = "type?option=showtype";
        } else if ("deltype".equals(option)){
            if (typeDAO.deleteType(Integer.parseInt(typeid))){
                info = "类别删除成功";
                session.removeAttribute("types");
            }else {
                info = "该新闻类别正在使用，不能删除";
            }
            req.setAttribute("info",info);
            target = "type?&option=showtype";
        }

        typeDAO = null;
        req.getRequestDispatcher(target).forward(req,resp);
    }
}
