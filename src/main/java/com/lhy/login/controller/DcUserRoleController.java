package com.lhy.login.controller;

import com.lhy.login.entity.DcUserRole;
import com.lhy.login.service.DcUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcUserRole)表控制层
 *
 * @author makejava
 * @since 2021-05-22 22:40:36
 */
@RestController
@RequestMapping("dcUserRole")
public class DcUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private DcUserRoleService dcUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcUserRole selectOne(Integer id) {
        return this.dcUserRoleService.findById(id);
    }

}