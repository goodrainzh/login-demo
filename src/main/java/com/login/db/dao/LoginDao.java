package com.login.db.dao;

import com.login.db.model.Login;


import java.util.Map;

/**
 * Created by 齐析屿 on 2017/9/2.
 */
public interface LoginDao {
    /**
     * 根据用户名查询数据库
     *
     *
     */
    public Login check(Map<String, String> map);


}
