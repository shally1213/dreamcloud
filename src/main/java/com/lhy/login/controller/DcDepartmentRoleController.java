package com.lhy.login.controller;

import com.lhy.login.entity.DcDepartmentRole;
import com.lhy.login.service.DcDepartmentRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcDepartmentRole)表控制层
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@RestController
@RequestMapping("dcDepartmentRole")
public class DcDepartmentRoleController {
    /**
     * 服务对象
     */
    @Resource
    private DcDepartmentRoleService dcDepartmentRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcDepartmentRole selectOne(Integer id) {
        return this.dcDepartmentRoleService.findById(id);
    }

}