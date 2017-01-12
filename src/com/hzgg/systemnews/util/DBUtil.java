package com.hzgg.systemnews.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 数据库连接访问工具类
 * Created by lsc on 2017/1/11 16:02.
 */
public class DBUtil {

    private Connection connection;

    /*
     * 连接数据库
     */
    public DBUtil() {
        InputStream is = super.getClass().getClassLoader().getResourceAsStream("database.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            Class.forName(properties.getProperty("driver"));
            connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /**
     * 建立sql发送通道
     * @param sql 执行语句
     * @return PreparedStatement
     */
    public PreparedStatement getPreparedStatement(String sql){
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    /**
     * 资源释放
     */
    public void close(){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String sql = "SELECT content FROM news";
        DBUtil dbUtil = new DBUtil();
        PreparedStatement ps = dbUtil.getPreparedStatement(sql);
        ResultSet rs = null;
        String sql1 = "INSERT INTO newstypes(typename) values(?)";
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("content"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ps = dbUtil.getPreparedStatement(sql1);
        try {
            ps.setString(1,"体育新闻");
            System.out.println(ps.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        dbUtil.close();
    }

}
