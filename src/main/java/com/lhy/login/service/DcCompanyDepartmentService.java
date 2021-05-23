package com.lhy.login.service;

import com.lhy.login.entity.DcCompanyDepartment;
import java.util.List;

/**
 * (DcCompanyDepartment)表服务接口
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
public interface DcCompanyDepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcCompanyDepartment findById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcCompanyDepartment> findAllLimit(int offset, int limit);

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
     * @return 实例对象
     */
    DcCompanyDepartment insert(DcCompanyDepartment dcCompanyDepartment);

    /**
     * 修改数据
     *
     * @param dcCompanyDepartment 实例对象
     * @return 实例对象
     */
    DcCompanyDepartment update(DcCompanyDepartment dcCompanyDepartment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}