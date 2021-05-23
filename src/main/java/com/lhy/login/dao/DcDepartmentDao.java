package com.lhy.login.dao;

import com.lhy.login.entity.DcDepartment;
import java.util.List;

/**
 * (DcDepartment)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
public interface DcDepartmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcDepartment findById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcDepartment> findAllLimit( int offset, int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcDepartment 实例对象
     * @return 对象列表
     */
    List<DcDepartment> queryAll(DcDepartment dcDepartment);

    /**
     * 新增数据
     *
     * @param dcDepartment 实例对象
     * @return 影响行数
     */
    int insert(DcDepartment dcDepartment);

    /**
     * 修改数据
     *
     * @param dcDepartment 实例对象
     * @return 影响行数
     */
    int update(DcDepartment dcDepartment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}