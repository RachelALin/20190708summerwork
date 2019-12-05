package com.ctguqmx.web.interceptor;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */


import com.ctguqmx.entity.Admin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        if(admin == null){
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }else{
            return true;
        }
    }
}
