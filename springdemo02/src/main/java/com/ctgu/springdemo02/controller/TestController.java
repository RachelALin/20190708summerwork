package com.ctgu.springdemo02.controller;


import com.ctgu.springdemo02.pojo.Category;
import com.ctgu.springdemo02.pojo.User;
import com.ctgu.springdemo02.service.UserLowService;
import com.ctgu.springdemo02.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/testBoot")
public class TestController {
    @Autowired
    UserService userService;

    @Autowired
    UserLowService userLowService;

    @RequestMapping("/dologin")
    @ResponseBody
    public String login(@RequestBody User user ){
        String result;
        User user1 = userService.loginService(user.getUserName(),user.getPassWord());
        if (user1!=null){
            result="1";
        }else {
            result="0";
        }
        return result;
    }

    @RequestMapping("/login")
    public String loginhtml(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/doregist")
    public String regist(@RequestBody User user){
        String result = "1";
        if (userService.register(user.getUserName(),user.getPassWord(),user.getRealidentity())!=0){
            result = "register";
        }
        return result;
    }
    @RequestMapping("/listCategory")
    public String listCategory(@RequestParam(name = "start",defaultValue = "0")int start, @RequestParam(name = "size", defaultValue = "5") int size, Model model){
        PageHelper.startPage(start,size,"id desc");
        List<Category> list1 = userLowService.FindAll();
        PageInfo<Category> page1 = new PageInfo<Category>(list1);
        model.addAttribute("page",page1);
        return "list";
    }
    @RequestMapping("/findCategory")
    public String findCategory(Category category, Model model2){
        Category category1 = userLowService.FindName(category.getUsername());
        model2.addAttribute("Category",category1);
        return "detail";
    }

    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category category, Model model1){
        userLowService.deleteById(category.getId());
//        model1.addAttribute("Category",category);
        return "redirect:/testBoot/listCategory";
    }
    @RequestMapping("/editCategory")
    public String editCategory(Category category,Model model3){
        Category category2 = userLowService.FindId(category.getId());
        model3.addAttribute("c",category2);
        return "editCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(Category category){
        userLowService.Update(category);
        return "redirect:/testBoot/listCategory";
    }
    @RequestMapping("/insertCategory")
    public String insertCategory(Category category){
        return "insert";
    }
    @RequestMapping("/addCategory")
    public String addtCategory(@RequestParam("username") String username,@RequestParam("sex") String sex,@RequestParam("age") Integer age){
        userLowService.Insert(username,sex,age);
        return "redirect:/testBoot/listCategory";
    }
}
