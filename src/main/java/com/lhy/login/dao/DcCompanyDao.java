package com.lhy.login.dao;

import com.lhy.login.entity.DcCompany;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DcCompany)表数据库访问层
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
public interface DcCompanyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcCompany findById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcCompany> findAllLimit(int offset,  int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcCompany 实例对象
     * @return 对象列表
     */
    List<DcCompany> queryAll(DcCompany dcCompany);

    /**
     * 新增数据
     *
     * @param dcCompany 实例对象
     * @return 影响行数
     */
    int insert(DcCompany dcCompany);

    /**
     * 修改数据
     *
     * @param dcCompany 实例对象
     * @return 影响行数
     */
    int update(DcCompany dcCompany);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}