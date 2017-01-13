package com.hzgg.systemnews.util;

import com.hzgg.systemnews.adminmanage.dao.AdminDAOImpl;
import com.hzgg.systemnews.newsmanage.dao.NewsDAOImpl;
import com.hzgg.systemnews.typemanage.dao.TypeDAOImpl;

/**
 * 实例工厂类
 * Created by lsc on 2017/1/12 11:14.
 */
public final class DaoFactory {

    /**
     * 根据名称获取不同接口实例
     * @param name 接口名称
     * @return IBaseDao接口实例
     */
    public static IBaseDAO getInstance(String name){
        if ("admin".equals(name)){
            return new AdminDAOImpl();
        } else if ("type".equals(name)){
            return new TypeDAOImpl();
        } else if ("news".equals(name)){
            return new NewsDAOImpl();
        } else {
            return null;
        }
    }

}
