package Servlet;

import DAO.userDao;
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
 * @create 2019/7/25
 */
@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        response.setContentType("text/html;charset=utf-8");
//请求解决乱码
        request.setCharacterEncoding("utf-8");
//响应解决乱码
        response.setCharacterEncoding("utf-8");
        user a = new user();
        a.setName(request.getParameter("name"));
        a.setSchoolnum(request.getParameter("schoolnum"));
        a.setCollege(request.getParameter("college"));
        a.setMajorin(request.getParameter("majorin"));
        a.setQq(request.getParameter("qq"));
        a.setTel(request.getParameter("tel"));
        a.setGroup(request.getParameter("group"));
        userService userservice = new userService();

        try {
            userservice.doAdduser(a);

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
