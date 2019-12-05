package Service;

import DAO.userDao;
import Entity.user;
import Util.jdbc;

import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class userService {
    private userDao userdao = new userDao();
    public void doAdduser(user a) throws SQLException, ClassNotFoundException {

        userdao.Insertuser(a);
    }

    public void doSearchuser(String schoolnum) throws SQLException, ClassNotFoundException {

        userdao.searchUser(schoolnum);
    }


    public void doUpdateuser(user user,String schoolnum) {
        try {
            userdao.updateuser(user, schoolnum);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void doDeleteUser(String schoolnum) throws SQLException, ClassNotFoundException {
        userdao.deleteUser(schoolnum);
    }
    public user doGetuser(String schoolnum) throws SQLException, ClassNotFoundException {
        return userdao.getUser(schoolnum);
    }

}
