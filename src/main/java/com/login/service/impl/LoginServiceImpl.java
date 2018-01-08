package com.login.service.impl;

import com.login.db.dao.LoginDao;
import com.login.db.model.Login;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by 齐析屿 on 2017/9/2.
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    public Login check(Map<String, String> map) {
        return loginDao.check(map);
    }
}
