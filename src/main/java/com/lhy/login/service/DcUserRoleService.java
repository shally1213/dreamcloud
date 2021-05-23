package com.lhy.login.service;

import com.lhy.login.entity.DcUserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (DcUserRole)表服务接口
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:36
 */
public interface DcUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcUserRole findById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcUserRole> findAllLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcUserRole 实例对象
     * @return 对象列表
     */
    List<DcUserRole> queryAll(DcUserRole dcUserRole);


    /**
     * 新增数据
     *
     * @param dcUserRole 实例对象
     * @return 实例对象
     */
    DcUserRole insert(DcUserRole dcUserRole);

    /**
     * 修改数据
     *
     * @param dcUserRole 实例对象
     * @return 实例对象
     */
    DcUserRole update(DcUserRole dcUserRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}