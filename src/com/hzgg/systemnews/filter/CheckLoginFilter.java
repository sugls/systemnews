package com.hzgg.systemnews.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lsc on 2017/1/13 11:21.
 */
@WebFilter(filterName = "CheckLoginFilter", urlPatterns = "/admin/*")
public class CheckLoginFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String uri = request.getRequestURI();


        if ("/admin/login.jsp".equals(uri)||"/admin".equals(uri)||"/admin/login".equals(uri)||uri.endsWith(".css")||uri.endsWith(".js")||uri.endsWith(".jpg")){
           chain.doFilter(request,response);
           return;
        }



        if (request.getSession().getAttribute("admin")!=null){
            chain.doFilter(request,response);
        }else {
            response.sendRedirect("login.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
