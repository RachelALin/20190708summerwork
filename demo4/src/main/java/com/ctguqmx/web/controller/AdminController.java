package com.ctguqmx.web.controller;

import com.ctguqmx.entity.Admin;
import com.ctguqmx.service.AdminService;
import com.ctguqmx.service.impl.AdminServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/29
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginPage()
    {
        return "login";
    }
    /**
     * @param admin 前端传给后端
     * @param model 相当于request
     * @param session 一次会话，session里面要保存登录信息
     * @return success：index
     *
     * */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Admin admin, Model model, HttpSession session)
    {
        if(adminService.login(admin))
        {
            //键值对,保存
            session.setAttribute("admin",admin);
            return "redirect:select";
        }
        else
        {
            model.addAttribute("msg","您的用户名或密码错误!");
            return "login";
        }
    }

}
