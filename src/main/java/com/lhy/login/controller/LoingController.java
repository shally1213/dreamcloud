package com.lhy.login.controller;

import com.lhy.login.service.DcUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@Controller
public class LoingController {

    /**
     * 服务对象
     */
    @Resource
    private DcUsersService usersService;

    @Autowired
    ServletContext servletContext;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 登录
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping({"/","/login"})
    public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userAccount = request.getParameter("userAccount");
        String password = request.getParameter("password");
        String companyId = request.getParameter("companyId");
        String roleId = request.getParameter("roleId");
        System.out.println(userAccount+"+++++++"+password);
        ModelAndView view = new ModelAndView("/index");
        return "login";
    }

}
