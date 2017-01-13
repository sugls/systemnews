package com.hzgg.systemnews.newsmanage.dao;

import com.hzgg.systemnews.newsmanage.vo.News;
import com.hzgg.systemnews.newsmanage.vo.Vnews;
import com.hzgg.systemnews.util.IBaseDAO;

import java.util.List;

/**
 * 新闻管理业务逻辑接口
 * Created by lsc on 2017/1/12 10:06.
 */
public interface INewsDAO extends IBaseDAO{

    /**
     * 添加新闻信息
     * @param news 新闻基本信息
     * @return 是否添加成功
     */
    boolean insertNews(News news);

    /**
     * 分页显示新闻数据信息
     * @param pages 当前页
     * @param pagesize 每页显示行数
     * @return Vnews集合
     */
    List<Vnews> getNews(int pages, int pagesize);

    /**
     * 获取总页数
     * @param pagesize 每页显示行数
     * @return 总页数
     */
    int getTotalPages(int pagesize);

    /**
     * 根据新闻编号获取新闻信息
     * @param newsid 新闻编号
     * @return News
     */
    News getNewsById(int newsid);

    /**
     * 修改新闻信息
     * @param news  新闻基本信息
     * @return 是否修改成功
     */
    boolean updateNews(News news);

    /**
     * 删除新闻信息
     * @param ids 新闻编号集合
     * @return 是否删除成功
     */
    boolean deleteNews(String[] ids);

}
