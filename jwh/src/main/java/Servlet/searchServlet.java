package Servlet;

import DAO.adminDao;
import Entity.user;
import Service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/27
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        response.setContentType("text/html;charset=utf-8");
//请求解决乱码
        request.setCharacterEncoding("utf-8");
//响应解决乱码
        response.setCharacterEncoding("utf-8");

        user user = new user();
        user.setSchoolnum(request.getParameter("schoolnum"));
        List<user> list = new ArrayList<user>();
        adminDao adminDao = new adminDao();
        try {
            list = adminDao.find(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(list !=null){
            request.setAttribute("list_",list);
            request.getRequestDispatcher("WEB-INF/select.jsp").forward(request,response);
        }
        else{
            System.out.println("查询失败！");
        }
    }

}
