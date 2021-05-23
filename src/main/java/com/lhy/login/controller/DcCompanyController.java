package com.lhy.login.controller;

import com.lhy.login.entity.DcCompany;
import com.lhy.login.service.DcCompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DcCompany)表控制层
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@RestController
@RequestMapping("dcCompany")
public class DcCompanyController {
    /**
     * 服务对象
     */
    @Resource
    private DcCompanyService dcCompanyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcCompany selectOne(Integer id) {
        return this.dcCompanyService.findById(id);
    }

}