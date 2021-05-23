package com.lhy.login.service;

import com.lhy.login.entity.DcRoles;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (DcRoles)表服务接口
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@Service
public interface DcRolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcRoles findById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcRoles> findAllLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcRoles 实例对象
     * @return 对象列表
     */
    List<DcRoles> queryAll(DcRoles dcRoles);


    /**
     * 新增数据
     *
     * @param dcRoles 实例对象
     * @return 实例对象
     */
    DcRoles insert(DcRoles dcRoles);

    /**
     * 修改数据
     *
     * @param dcRoles 实例对象
     * @return 实例对象
     */
    DcRoles update(DcRoles dcRoles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}