package com.lhy.login.service;

import com.lhy.login.entity.DcDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (DcDepartment)表服务接口
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@Service
public interface DcDepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcDepartment findById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcDepartment> findAllLimit(int offset, int limit);

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
     * @return 实例对象
     */
    DcDepartment insert(DcDepartment dcDepartment);

    /**
     * 修改数据
     *
     * @param dcDepartment 实例对象
     * @return 实例对象
     */
    DcDepartment update(DcDepartment dcDepartment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}