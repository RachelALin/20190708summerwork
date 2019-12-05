package Service;

import DAO.adminDao;
import DAO.userDao;
import Entity.admin;
import Entity.user;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class adminService {
    private adminDao admindao = new adminDao();
    private userDao userdao = new userDao();
    public Boolean doLoginadmin(admin admin) throws SQLException, ClassNotFoundException {
        boolean msg = false;

        msg = admindao.Loginadmin(admin);

        return msg;
    }
    public List<user> doList() throws SQLException, ClassNotFoundException {

        return admindao.getPost();
    }

}