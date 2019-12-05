package DAO;

import Entity.admin;
import Entity.user;
import Util.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class adminDao {
    public Boolean Loginadmin(admin admin) throws SQLException, ClassNotFoundException {

        Connection connection = jdbc.getConnection();

        String sql = "select * from `admin` where `name` = ? and password = ?";

        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1,admin.getName());
        pst.setString(2,admin.getPassword());

        ResultSet rs = pst.executeQuery();
        Boolean msg = false;
        if (rs.next()) {
            msg = true;
        } else {
            msg = false;
        }
        return msg;
    }
    public List<user> getPost() throws SQLException, ClassNotFoundException {

        Connection connection = jdbc.getConnection();

        String sql = "select * from user";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        List<user> list = new ArrayList<user>();

        while (rs.next()) {
            user user = new user();
            user.setName(rs.getString("name"));
            user.setSchoolnum(rs.getString("schoolnum"));
            user.setCollege(rs.getString("college"));
            user.setMajorin(rs.getString("majorin"));
            user.setQq(rs.getString("qq"));
            user.setTel(rs.getString("tel"));
            user.setGroup(rs.getString("group"));
            user.setId(rs.getInt("id"));
            list.add(user);
        }

        return list;
    }

    public void update(user user) throws SQLException, ClassNotFoundException {
        Connection connection = jdbc.getConnection();
        String sql = "update `user` set `name`= ?,`schoolnum` =?,`college` = ?,`majorin`=?,`qq`=?,`tel`=?,`group`=? ";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1,user.getName());
        pst.setString(2,user.getSchoolnum());
        pst.setString(3,user.getCollege());
        pst.setString(4,user.getMajorin());
        pst.setString(5,user.getQq());
        pst.setString(6,user.getTel());

        pst.setString(7,user.getGroup());

//        pst.setString(8,user.getId());
        pst.execute();

    }

    public void add(user user) throws SQLException, ClassNotFoundException {
        Connection connection = jdbc.getConnection();
        String sql = "insert into `user` (`name`,`schoolnum`,`college`,`majorin`,`qq`,`tel`,`group`) value(?,?,?,?,?,?,?)";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1,user.getName());
        pst.setString(2,user.getSchoolnum());
        pst.setString(3,user.getCollege());
        pst.setString(4,user.getMajorin());
        pst.setString(5,user.getQq());
        pst.setString(6,user.getTel());
        pst.setString(7,user.getGroup());
        pst.executeUpdate();
        System.out.println("插入成功！");
    }

    public List<user> find(user user) throws SQLException, ClassNotFoundException {
        Connection connection = jdbc.getConnection();
        String sql = "select * from `user` where `schoolnum` = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString((int)1,user.getSchoolnum());
        ResultSet rs = pst.executeQuery();
        List<user> list = new ArrayList<user>();
        while(rs.next()){
//            user.setName(rs.getString(4));
//            user.setGroup(rs.getString(10));
//            user.setQQ(rs.getString(6));
//            user.setMajor(rs.getString(9));
//            user.setId(rs.getString(2));
//            list.add(student);
            user.setName(rs.getString("name"));
            user.setSchoolnum(rs.getString("schoolnum"));
            user.setCollege(rs.getString("college"));
            user.setMajorin(rs.getString("majorin"));
            user.setQq(rs.getString("qq"));
            user.setTel(rs.getString("tel"));
            user.setGroup(rs.getString("group"));
            user.setId(rs.getInt("id"));
            list.add(user);
            System.out.println(list);
        }
        return list;
    }
}

