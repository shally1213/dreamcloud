package com.lhy.login.controller;

import com.lhy.login.entity.DcUsers;
import com.lhy.login.service.DcUsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcUsers)表控制层
 *
 * @author makejava
 * @since 2021-05-22 22:39:26
 */
@RestController
@RequestMapping("dcUsers")
public class DcUsersController {
    /**
     * 服务对象
     */
    @Resource
    private DcUsersService dcUsersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcUsers selectOne(Integer id) {
        return this.dcUsersService.findById(id);
    }

}