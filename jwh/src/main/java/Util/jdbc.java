package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class jdbc {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/javaweb?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8";
        String username = "root" ;
        String password = "123456" ;
        String driver = "com.mysql.cj.jdbc.Driver";

        //加载驱动类
        Class.forName(driver);

        //获得数据库连接
        Connection connection = DriverManager.getConnection(url , username , password );

        return connection;
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }
}
