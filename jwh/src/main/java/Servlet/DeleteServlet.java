package Servlet;

import Entity.user;
import Service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //解决中文乱码
        response.setContentType("text/html;charset=utf-8");
        //请求解决乱码
        request.setCharacterEncoding("utf-8");
        //响应解决乱码
        response.setCharacterEncoding("utf-8");

//        获取jsp传过来的值

        userService userservice = new userService();
        String id = request.getParameter("schoolnum");
        System.out.println(id);
        try {
            userservice.doDeleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
