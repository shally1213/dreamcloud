package com.lhy.login.dao;

import com.lhy.login.entity.DcDepartmentRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DcDepartmentRole)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@Repository
public interface DcDepartmentRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcDepartmentRole findById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcDepartmentRole> findAllLimit( int offset,  int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcDepartmentRole 实例对象
     * @return 对象列表
     */
    List<DcDepartmentRole> queryAll(DcDepartmentRole dcDepartmentRole);

    /**
     * 新增数据
     *
     * @param dcDepartmentRole 实例对象
     * @return 影响行数
     */
    int insert(DcDepartmentRole dcDepartmentRole);

    /**
     * 修改数据
     *
     * @param dcDepartmentRole 实例对象
     * @return 影响行数
     */
    int update(DcDepartmentRole dcDepartmentRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}