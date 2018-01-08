package com.login.controller;

/**
 * Created by 齐析屿 on 2017/8/25.
 */

import com.login.service.LoginService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import com.login.db.model.*;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import MD5.md5;

@Controller

public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value= "/welcome")
    public ModelAndView Login(HttpServletRequest req, ModelAndView mv){
        Map<String, String> map = new HashMap<String, String>();
        String username = req.getParameter("username");
        map.put("username",username );
        if(req.getParameter("password")!=null) {
            String password = md5.getMD5WithSalt(req.getParameter("password"));
            map.put("password", password);
        }else {
            map.put("password", req.getParameter("password"));
        }
      Login login = loginService.check(map);
      if(login!=null){
          try {
              logger.warn(username + " come in the iLab");
              Process p = Runtime.getRuntime().exec("python d:\\lokerclient.py");
          } catch (IOException e) {
              e.printStackTrace();
          }
          mv.setViewName("welcome");
      }else if(username != null) {
          logger.warn(username + " tried to enter the iLab but failed");
          mv.addObject("message", "用户名或密码输入错误,请重新输入");
          mv.setViewName("index");
      } else {
          mv.addObject("message", "");
          mv.setViewName("index");
      }
      return mv;

    }
}