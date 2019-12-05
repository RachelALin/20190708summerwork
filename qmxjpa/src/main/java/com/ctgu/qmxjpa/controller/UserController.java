package com.ctgu.qmxjpa.controller;

import com.ctgu.qmxjpa.pojo.Admin;
import com.ctgu.qmxjpa.pojo.User;
import com.ctgu.qmxjpa.service.AdminService;
import com.ctgu.qmxjpa.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.controller
 * @date 2019/8/5
 * @time 21:45
 */
@Controller
@RequestMapping("/testBoot")

public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private AdminService adminService;


    @RequestMapping("/dologin")
    @ResponseBody
    public String login(@RequestBody Admin admin ){
        System.out.println("这里会输出吗？"+admin);
        String result;
        Admin admin1 = adminService.loginService(admin.getUsername(),admin.getPassword());
        if (admin1!=null){
            result="1";
        }else {
            result="0";
        }
        return result;
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/doregist")
    public String regist(@RequestBody Admin admin){
        String result = "1";
        if (adminService.saveAndFlush(admin)!=null){
            result = "register";
        }
        return result;
    }

    @RequestMapping("/listCategory")
    public String listCategory(@RequestParam(name = "start",defaultValue = "0")int start, @RequestParam(name = "size", defaultValue = "5") int size, Model model){
        PageHelper.startPage(start,size,"id desc");
        List<User> list1 = userService.findAll();
        PageInfo<User> page1 = new PageInfo<User>(list1);
        model.addAttribute("page1",page1);
        return "list";
    }
    @RequestMapping("/findCategory")
    public String findCategory(User user, Model model2){
        User user1 = userService.findUserrByUsername(user.getUsername());
        model2.addAttribute("user1",user1);
        return "detail";
    }

    @RequestMapping("/deleteCategory")
    public String deleteCategory(User user){
        userService.deleteUserrById(user.getId());

        return "redirect:/testBoot/listCategory";
    }
    @RequestMapping("/editCategory")
    public String editCategory(User user,Model model3){
        User user2 = userService.findUserrById(user.getId());
        model3.addAttribute("c",user2);
        return "editCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(User user){
        userService.saveAndFlush(user);
        return "redirect:/testBoot/listCategory";
    }
    @RequestMapping("/addCategory")
    public String insertCategory(User user){
        return "insert";
    }

    @RequestMapping("/insertCategory")
    public String addCategory(User user){
        userService.saveAndFlush(user);
        return "redirect:/testBoot/listCategory";
    }

}
