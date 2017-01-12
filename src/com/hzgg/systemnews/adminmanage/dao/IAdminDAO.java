package com.hzgg.systemnews.adminmanage.dao;

import com.hzgg.systemnews.adminmanage.vo.Admins;
import com.hzgg.systemnews.util.IBaseDAO;

/**
 * 新闻管理员业务逻辑接口
 * Created by lsc on 2017/1/12 9:48.
 */
public interface IAdminDAO extends IBaseDAO{

    /**
     * 登录验证
     * @param username 用户名
     * @param userpwd 密码
     * @return Admins
     */
    Admins checkLogin(String username, String userpwd);


}
