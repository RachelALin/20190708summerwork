package com.ctguqmx.controller;

import com.ctguqmx.entity.Admin;
import com.ctguqmx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
@Controller("adminController")
public class AdminController {
    @Autowired
    private AdminService adminService;
    public void addAdmin(Admin admin) {
        if(adminService.addAdmin(admin)!=0){
            System.out.println("插入成功！");
        }else{
            System.out.println("插入失败");
        }
    }

    public void deleteAdmin(Admin admin) {
        if(adminService.deleteAdmin(admin)!=0){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }

    public void updateAdmin(Admin admin) {
        if (adminService.updateAdmin(admin)!=0){
            System.out.println("更新成功！");
        }else{
            System.out.println("更新失败!");
        }
    }

    public Admin selectAdmin(Admin admin) {
        if (adminService.selectAdmin(admin) != null){
            System.out.println("查询成功！");
            return adminService.selectAdmin(admin);
        }
        else{
            System.out.println("查询失败！");
            return null;
        }
    }
}
