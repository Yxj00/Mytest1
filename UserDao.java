package com.icss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public User login(String username, String password) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql="select *from tb_user where username=? and password =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet resultSet = ps.executeQuery();
        User user=null;
        // 处理结果集
        while (resultSet.next()){
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
        }
        // 释放资源
        JDBCUtil.close(resultSet,ps,connection);
        return user;
    }
    public void deleteById(int id) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql="delete from tb_user where id =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,id);
        ps.executeUpdate();
        JDBCUtil.close(null,ps,connection);

    }

    public List<User> selectAll() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql="select *from tb_user";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> list=new ArrayList<>();
        User user=null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            list.add(user);
        }
        JDBCUtil.close(rs,ps,connection);
        return list;
    }


    public void Insert(int id,String username,String password) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql="insert into tb_user(id,username,password) values(?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2,username);
        ps.setString(3,password);
        ps.executeUpdate();
        JDBCUtil.close(null,ps,connection);
    }

    public int count() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql="select count(*) count from tb_user";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int count=0;
        while (rs.next()){
            count=rs.getInt("count");
        }
        JDBCUtil.close(rs,ps,connection);
        return count;
    }
}
