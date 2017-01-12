package com.hzgg.systemnews.typemanage.dao;

import com.hzgg.systemnews.typemanage.vo.NewsTypes;
import com.hzgg.systemnews.util.IBaseDAO;

import java.util.List;

/**
 * 新闻类别业务逻辑接口
 * Created by lsc on 2017/1/12 10:03.
 */
public interface ITypeDAO extends IBaseDAO{

    /**
     * 添加新闻类别
     * @param type 新闻类别基本数据信息
     * @return 是否添加成功
     */
    boolean insertType(NewsTypes type);

    /**
     * 获取所有类别信息
     * @return NewsType集合
     */
    List<NewsTypes> getTypes();

    /**
     * 删除新闻类别
     * @param typeid 类别编号
     * @return 是否删除成功
     */
    boolean deleteType(int typeid);

    /**
     * 通过类别编号获取类别信息
     * @param typeid 类别编号
     * @return NewsTypes
     */
    NewsTypes getTypeById(int typeid);

    /**
     * 修改新闻类别
     * @param type 新闻类别
     * @return 是否修改成功
     */
    boolean updateType(NewsTypes type);

}
