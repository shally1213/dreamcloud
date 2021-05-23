package com.lhy.login.controller;

import com.lhy.login.entity.DcDepartment;
import com.lhy.login.service.DcDepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcDepartment)表控制层
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@RestController
@RequestMapping("dcDepartment")
public class DcDepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DcDepartmentService dcDepartmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcDepartment selectOne(Integer id) {
        return this.dcDepartmentService.findById(id);
    }

}