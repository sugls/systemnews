package com.hzgg.systemnews.typemanage.dao;

import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.CloseStream;
import com.hzgg.systemnews.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * 新闻类别业务逻辑实现类
 * Created by lsc on 2017/1/12 10:03.
 */
public class TypeDAOImpl implements ITypeDAO {
    @Override
    public boolean insertType(NewsTypes type) {
        boolean result = false;
        DBUtil db = new DBUtil();
        String sql = "INSERT INTO newstypes(typename) VALUES(?)";
        PreparedStatement ps = db.getPreparedStatement(sql);
        try {
            ps.setString(1, type.getTypename());
            int i = ps.executeUpdate();
            if (i != 0) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                CloseStream.close(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        db.close();
        return result;
    }

    @Override
    public List<NewsTypes> getTypes() {
        List<NewsTypes> types = new Vector<>();
        DBUtil db = new DBUtil();
        String sql = "SELECT typeid,typename FROM newstypes ORDER BY typeid DESC";
        PreparedStatement ps = db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                NewsTypes type = new NewsTypes();
                type.setTypeid(rs.getInt("typeid"));
                type.setTypename(rs.getString("typename"));
                types.add(type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                CloseStream.close(ps, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        db.close();
        return types;
    }


    @Override
    public boolean deleteType(int typeid) {
        boolean result = false;
        DBUtil db = new DBUtil();
        String sql = "SELECT newsid from news where typeid=?";
        PreparedStatement ps = db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            ps.setInt(1, typeid);
            rs = ps.executeQuery();
            if (!rs.next()) {
                String sql1 = "delete from newstypes where typeid=?";
                ps = db.getPreparedStatement(sql1);
                ps.setInt(1, typeid);
                int i = ps.executeUpdate();
                if (i != 0) {
                    result = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                CloseStream.close(ps, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        db.close();
        return result;
    }


    @Override
    public NewsTypes getTypeById(int typeid) {
        NewsTypes type = new NewsTypes();
        DBUtil db = new DBUtil();
        String sql = "select typename from newstypes where typeid=?";
        PreparedStatement ps = db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            ps.setInt(1,typeid);
            rs = ps.executeQuery();
            rs.next();
            type.setTypeid(typeid);
            type.setTypename(rs.getString("typename"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                CloseStream.close(ps,rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        db.close();
        return type;
    }

    @Override
    public boolean updateType(NewsTypes type) {
        boolean result = false;
        DBUtil dbUtil = new DBUtil();
        String sql = "UPDATE newstypes SET typename=? where typeid=?";
        PreparedStatement ps = dbUtil.getPreparedStatement(sql);
        try {
            ps.setString(1, type.getTypename());
            ps.setInt(2, type.getTypeid());
            int i = ps.executeUpdate();
            if (1!=0){
                result =true;
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally {
            try {
                CloseStream.close(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        dbUtil.close();
        return result;
    }
}
