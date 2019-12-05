package Servlet;

import DAO.adminDao;
import Entity.user;

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
 * @create 2019/7/29
 */
@WebServlet("/useraddServlet")
public class useraddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //请求解决乱码
        request.setCharacterEncoding("utf-8");
        //响应解决乱码
        response.setCharacterEncoding("utf-8");
        user user = new user();
        adminDao adminDao = new adminDao();
        user.setName(request.getParameter("name"));
        user.setSchoolnum(request.getParameter("schoolnum"));
        user.setCollege(request.getParameter("college"));
        user.setMajorin(request.getParameter("majorin"));
        user.setQq(request.getParameter("qq"));
        user.setTel(request.getParameter("tel"));
        user.setGroup(request.getParameter("group"));
        try {
            adminDao.add(user);
            System.out.println("插入成功lm");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
