package com.icss;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    // 声明数据库的四个属性
    private static String driver=null;
    private static String url=null;
    private static String user=null;
    private static String password=null;
    static {
        try {
            // 读取properties中的属性
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
            // 获取属性
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            // 加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException | IOException e) {
           e.printStackTrace();
        }

    }

    /**
     * 获取连接
     * @return
     * @throws SQLException
     */

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(ResultSet rs,Statement statement, Connection connection) throws SQLException {
        if (rs!=null){
            rs.close();
        }
        if (statement!=null){
            statement.close();
        }
        if (connection!=null){
            connection.close();
        }
    }
}
