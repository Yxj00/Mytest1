package com.icss;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCDemo01 {
    public static void main(String[] args)  throws Exception{
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url="jdbc:mysql:///s2?useSSL=false";
//            String username="root";
//            String password="";
//            Connection conn = DriverManager.getConnection(url, username, password);
//            System.out.println(conn);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        Properties prop = new Properties();

            prop.load(JDBCDemo01.class.getClassLoader().getResourceAsStream("druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
            Connection conn = dataSource.getConnection();
            System.out.println(conn);


    }
}
