package com.lhy.login.controller;

import com.lhy.login.entity.DcCompanyDepartment;
import com.lhy.login.service.DcCompanyDepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcCompanyDepartment)表控制层
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@RestController
@RequestMapping("dcCompanyDepartment")
public class DcCompanyDepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DcCompanyDepartmentService dcCompanyDepartmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcCompanyDepartment selectOne(Integer id) {
        return this.dcCompanyDepartmentService.findById(id);
    }

}