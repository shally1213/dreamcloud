package com.lhy.login.dao;

import com.lhy.login.entity.DcCompanyDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DcCompanyDepartment)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@Repository
public interface DcCompanyDepartmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcCompanyDepartment findById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcCompanyDepartment> findAllLimit(int offset,  int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcCompanyDepartment 实例对象
     * @return 对象列表
     */
    List<DcCompanyDepartment> queryAll(DcCompanyDepartment dcCompanyDepartment);

    /**
     * 新增数据
     *
     * @param dcCompanyDepartment 实例对象
     * @return 影响行数
     */
    int insert(DcCompanyDepartment dcCompanyDepartment);

    /**
     * 修改数据
     *
     * @param dcCompanyDepartment 实例对象
     * @return 影响行数
     */
    int update(DcCompanyDepartment dcCompanyDepartment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}