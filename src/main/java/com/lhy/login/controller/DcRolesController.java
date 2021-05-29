package com.lhy.login.controller;

import com.lhy.login.entity.DcRoles;
import com.lhy.login.service.DcRolesService;
import com.lhy.vo.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcRoles)表控制层
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@RestController
@RequestMapping("dcRoles")
public class DcRolesController {
    /**
     * 服务对象
     */
    @Resource
    private DcRolesService dcRolesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DcRoles selectOne(Integer id) {
        return this.dcRolesService.findById(id);
    }


    @GetMapping("get_roles")
    public JsonResult<List<DcRoles>> getRoles(DcRoles roles){
        List<DcRoles> dcRoles = dcRolesService.queryAll(roles);
        return new JsonResult<>(dcRoles);
    }


}