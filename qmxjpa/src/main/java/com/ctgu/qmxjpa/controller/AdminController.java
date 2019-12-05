//package com.ctgu.qmxjpa.controller;
//
//import com.ctgu.qmxjpa.pojo.Admin;
//import com.ctgu.qmxjpa.service.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
///**
// * @author Alin
// * @packagename com.ctgu.qmxjpa.controller
// * @date 2019/8/5
// * @time 21:56
// */
//
//@Controller
//@RequestMapping("/testBoot")
//public class AdminController {
//
//
//    @Autowired
//    private AdminService adminService;
//
//
//    @RequestMapping("/dologin")
//    @ResponseBody
//    public String login(@RequestBody Admin admin ){
//        String result;
//        Admin admin1 = adminService.loginService(admin.getUsername(),admin.getPassword());
//        if (admin1!=null){
//            result="1";
//        }else {
//            result="0";
//        }
//        return result;
//    }
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }
//
//    @RequestMapping("/register")
//    public String register(){
//        return "register";
//    }
//
//    @RequestMapping("/doregist")
//    public String regist(@RequestBody Admin admin){
//        String result = "1";
//        if (adminService.saveAndFlush(admin)!=null){
//            result = "register";
//        }
//        return result;
//    }
//
//}
