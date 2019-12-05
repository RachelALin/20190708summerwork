package com.ctguqmx.web.controller;

import com.ctguqmx.entity.User;
import com.ctguqmx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/30
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)

    public String addUser(User user, Model model, HttpSession session){
        if (userService.addUser(user)){
            session.setAttribute("user",user);
            return"redirect:/select";
        }
        else{
            model.addAttribute("masg","添加失败哦");
            return "404";
        }

    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteUser(@RequestParam("name")String name){
        if (userService.deleteUser(name)) {
            return "redirect:select";
        }
        else {
            return "404";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String updateUser( @RequestParam("id") Integer id,Model model){
        User user = userService.selectUserById(id);
        model.addAttribute("user",user);
        System.out.println("在这里在这里");
        System.out.println(user);
        return "create";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(User user, Model model){
        if(userService.updateUser(user)){
            return "redirect:/select";
        }
        else{
            model.addAttribute("user",user);
            return "list";
        }

    }


    @RequestMapping("/select")
    public String selectUser(Model model){
        List<User> list = userService.selectAll();
        model.addAttribute("userlist",list);
        return "list";
    }
    @RequestMapping("/selectname")
    public String selectUserByName(@RequestParam(value = "name") String name ,Model model){
        System.out.println(name);
        List<User> list = userService.selectUserByName(name);

        model.addAttribute("userlist",list);

        return "list";
    }

}
