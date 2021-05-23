package com.lhy.login.dao;

import com.lhy.login.entity.DcUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DcUsers)表数据库访问层
 *
 * @author lihongyan
 * @since 2021-05-22 22:39:20
 */
@Repository
public interface DcUsersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcUsers findById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DcUsers> findAllLimit(int offset, int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcUsers 实例对象
     * @return 对象列表
     */
    List<DcUsers> queryAll(DcUsers dcUsers);

    /**
     * 新增数据
     *
     * @param dcUsers 实例对象
     * @return 影响行数
     */
    int insert(DcUsers dcUsers);

    /**
     * 修改数据
     *
     * @param dcUsers 实例对象
     * @return 影响行数
     */
    int update(DcUsers dcUsers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}