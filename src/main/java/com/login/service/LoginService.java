package com.login.service;

import com.login.db.model.Login;

import java.util.Map;

/**
 * Created by 齐析屿 on 2017/9/2.
 */
public interface LoginService {

    /**
     * 从数据库中查找用户
     */
    public Login check(Map<String, String> map);

}
