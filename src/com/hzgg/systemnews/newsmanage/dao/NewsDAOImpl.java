package com.hzgg.systemnews.newsmanage.dao;

import com.hzgg.systemnews.newsmanage.vo.News;
import com.hzgg.systemnews.newsmanage.vo.Vnews;
import com.hzgg.systemnews.util.CloseStream;
import com.hzgg.systemnews.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * 新闻管理业务逻辑实现类
 * Created by lsc on 2017/1/12 10:06.
 */
public class NewsDAOImpl implements INewsDAO{
    @Override
    public boolean insertNews(News news) {
        return false;
    }

    @Override
    public List<Vnews> getNews(int pages, int pagesize) {
        List<Vnews> news = new Vector<>();
        DBUtil db = new DBUtil();
        String sql = "select newsid,title,author,createdate,typename from vnews limit ?,?";
        PreparedStatement ps= db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            ps.setInt(1,(pages-1)*pagesize);
            ps.setInt(2,pagesize);
            rs = ps.executeQuery();
            while (rs.next()){
                Vnews vnew = new Vnews();
                vnew.setTypename(rs.getString("typename"));
                vnew.setAuthor(rs.getString("author"));
                vnew.setCreatedate(rs.getDate("createdate"));
                vnew.setNewsid(rs.getInt("newsid"));
                vnew.setTitle(rs.getString("title"));
                news.add(vnew);
            }
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
        return news;
    }

    @Override
    public int getTotalPages(int pagesize) {
        int totalpages = 1;
        DBUtil db = new DBUtil();
        String sql = "select count(newsid) total from news";
        PreparedStatement ps = db.getPreparedStatement(sql);
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            rs.next();
            int totalrecord = rs.getInt("total");
            totalpages = (totalrecord % pagesize ==0?0:1)+totalrecord/pagesize;
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
        return totalpages;
    }

    @Override
    public News getNewsById(int newsid) {
        return null;
    }

    @Override
    public boolean updateNews(News news) {
        return false;
    }

    @Override
    public boolean deleteNews(String[] ids) {
        return false;
    }
}
