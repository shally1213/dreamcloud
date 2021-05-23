package com.lhy.login.controller;

import com.lhy.login.service.DcUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * @author lihongyan
 * @version 1.0
 * @date 2021/5/22 21:11
 */
@Controller
public class LoingController {

    /**
     * 服务对象
     */
    @Resource
    private DcUsersService usersService;

    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

}
