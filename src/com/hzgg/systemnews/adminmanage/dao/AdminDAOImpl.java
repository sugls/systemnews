package com.hzgg.systemnews.adminmanage.dao;

import com.hzgg.systemnews.adminmanage.vo.Admins;
import com.hzgg.systemnews.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 新闻管理员业务逻辑实现类
 * Created by lsc on 2017/1/12 9:48.
 */
public class AdminDAOImpl implements IAdminDAO{
    @Override
    public Admins checkLogin(String username, String userpwd) {
        Admins admin = null;
        DBUtil db = new DBUtil();
        String sql = "SELECT adminid,realname FROM admins WHERE userpwd=? AND username=?";
        PreparedStatement ps = db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            ps.setString(1,userpwd);
            ps.setString(2,username);
            rs = ps.executeQuery();
            if (rs.next()){
                admin = new Admins();
                admin.setAdminid(rs.getInt("adminid"));
                admin.setRealname(rs.getString("realname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          try {
              if (rs!=null){
                  rs.close();
              }
              if (ps!=null){
                  ps.close();
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }
        }
        db.close();
        return admin;
    }
}
