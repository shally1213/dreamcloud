package com.lhy.login.controller;

import com.lhy.login.entity.DcUsers;
import com.lhy.login.service.DcUsersService;
import com.lhy.login.service.impl.DcUsersServiceImpl;
import com.lhy.vo.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lihongyan
 * @version 1.0
 * @date 2021/5/22 21:11
 */
//@Controller
@RestController
public class LoingController {

    /**
     * 服务对象
     */
    @Resource
    private DcUsersService usersService;

//    @Autowired
//    ServletContext servletContext;

    @Autowired
    private DcUsersService service;
//    @RequestMapping("/index")
//    public String index() {
//        System.out.println("ssss");
//        return "index";
//    }

    /**
     * 登录
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
//    @RequestMapping({"/","/login"})
    @RequestMapping("/login")
    public JsonResult<Void> login(@RequestParam("userAccount") String userAccount, @RequestParam("password") String password,
                        @RequestParam("companyId") String companyId, @RequestParam("roleId") String roleId) {
        service.login(userAccount,password);
        //session or redis
        return new JsonResult<>();
    }

    @RequestMapping("/check_account")
    public JsonResult<Void> checkName(@RequestParam("userAccount") String userAccount) {
        service.checkAccount(userAccount);
        return new JsonResult<>();
    }

}
