package DAO;

import Entity.user;
import Util.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class userDao {
    private user user = new user();
    public void Insertuser(user user) throws SQLException, ClassNotFoundException {

//操作数据库增加
        Connection connection = jdbc.getConnection();
        String SQL = "insert into user(`name`, `schoolnum`,`college`,`majorin`,`qq`,`tel`,`group`) values(?,?,?,?,?,?,?)";
        PreparedStatement pst = connection.prepareStatement(SQL);

        pst.setString(1,user.getName());
        pst.setString(2,user.getSchoolnum());
        pst.setString(3,user.getCollege());
        pst.setString(4,user.getMajorin());
        pst.setString(5,user.getQq());
        pst.setString(6,user.getTel());
        pst.setString(7,user.getGroup());
        pst.executeUpdate();
        pst.close();
        connection.close();

    }


    public void deleteUser(String schoolnum) throws SQLException, ClassNotFoundException {

        Connection connection = jdbc.getConnection();
        String sql = "delete from `user` where `schoolnum` = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, schoolnum);
        pst.executeUpdate();
        connection.close();
        System.out.println("删除成功");
    }
    public void searchUser(String schoolnum) throws SQLException, ClassNotFoundException {
        Connection connection = jdbc.getConnection();
        String sql = "select * from `user` where schoolnum = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, schoolnum);
        pst.executeUpdate();
        connection.close();
    }
    public void updateuser(Entity.user user, String schoolnum) throws SQLException, ClassNotFoundException {
        Connection connection = jdbc.getConnection();
        String sql = "update `user` set `name`=?,`schoolnum`=?,`college`=?,`majorin`=?,`qq`=?,`tel`=?,`group`=?"
                + "where schoolnum = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, this.user.getName());
        pst.setString(2, this.user.getSchoolnum());
        pst.setString(3, this.user.getCollege());
        pst.setString(4, this.user.getMajorin());
        pst.setString(5, this.user.getQq());
        pst.setString(6, this.user.getTel());
        pst.setString(7, this.user.getGroup());
        pst.setString(8, schoolnum);
        pst.executeUpdate();
        connection.close();
    }
    public user getUser(String schoolnum) throws SQLException, ClassNotFoundException {

        Connection connection = jdbc.getConnection();
        String sql = "select* from `user` where `schoolnum` = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, schoolnum);
        ResultSet rs = pst.executeQuery();
        user user = new user();
        while(rs.next()) {
            user.setName(rs.getString("name"));
            user.setSchoolnum(schoolnum);
            user.setCollege(rs.getString("college"));
            user.setMajorin(rs.getString("majorin"));
            user.setQq(rs.getString("qq"));
            user.setTel(rs.getString("tel"));
            user.setGroup(rs.getString("group"));
        }
        connection.close();
        return user;
    }


}
