package com.hzgg.systemnews.newsmanage.servlet;

import com.hzgg.systemnews.newsmanage.dao.INewsDAO;
import com.hzgg.systemnews.newsmanage.vo.Vnews;
import com.hzgg.systemnews.typemanage.dao.ITypeDAO;
import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 新闻管理模块控制器
 * Created by lsc on 2017/1/12 10:07.
 */
@WebServlet(name = "NewsServlet",urlPatterns = "/admin/news")
public class NewsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        String ps = req.getParameter("pages");
        HttpSession session = req.getSession();
        String target = null;
        int pages = 1;
        int pagesize = 5;


        ITypeDAO typeDAO = (ITypeDAO) DaoFactory.getInstance("type");
        INewsDAO newsDAO = (INewsDAO) DaoFactory.getInstance("news");

        if ("addlink".equals(option)){
            List<NewsTypes> types = (List<NewsTypes>) session.getAttribute("types");
            if (types==null){
                types = typeDAO.getTypes();
                if (types.size()>0){
                    session.setAttribute("types",types);
                }
            }
            target = "newsadd.jsp";
        }else if ("shownews".equals(option)){
            Integer totalpages = (Integer) session.getAttribute("totalpages");
            if (totalpages==null){
                totalpages = newsDAO.getTotalPages(pagesize);
                session.setAttribute("totalpages",totalpages);
            }
            if (ps!=null){
                try{
                    pages = Integer.parseInt(ps);
                }catch (NumberFormatException e){
                    pages = 1;
                }
            } else {
                pages = 1;
            }
            if (pages<1){
                pages = 1;
            }
            if (pages>totalpages){
                pages = totalpages;
            }
            List<Vnews> news = newsDAO.getNews(pages,pagesize);
            req.setAttribute("newss",news);
            req.setAttribute("pages",pages);
            req.setAttribute("totalpages",totalpages);
            target="newslist.jsp";
        }

        newsDAO = null;
        req.getRequestDispatcher(target).forward(req,resp);
    }
}
