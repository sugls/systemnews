package com.hzgg.systemnews.typemanage.dao;

import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * 新闻类别业务逻辑实现类
 * Created by lsc on 2017/1/12 10:03.
 */
public class TypeDAOImpl implements ITypeDAO{
    @Override
    public boolean insertType(NewsTypes type) {
        boolean result = false;
        DBUtil db = new DBUtil();
        String sql = "INSERT INTO newstypes(typename) VALUES(?)";
        PreparedStatement ps = db.getPreparedStatement(sql);
        try {
            ps.setString(1,type.getTypename());
            int i = ps.executeUpdate();
            if (i!=0){
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps!=null){
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        db.close();
        return result;
    }

    @Override
    public List<NewsTypes> getTypes() {
        return null;
    }

    @Override
    public boolean deleteType(int typeid) {
        return false;
    }

    @Override
    public NewsTypes getTypeById(int typeid) {
        return null;
    }

    @Override
    public boolean updateType(NewsTypes type) {
        return false;
    }
}
