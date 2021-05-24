package com.lhy.login.service;

import com.lhy.login.entity.DcUsers;
import java.util.List;

/**
 * (DcUsers)表服务接口
 *
 * @author makejava
 * @since 2021-05-23 20:59:10
 */
public interface DcUsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DcUsers findById(Integer id);

    /**
     * 查询多条数据
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
     * @return 实例对象
     */
    DcUsers insert(DcUsers dcUsers);

    /**
     * 修改数据
     *
     * @param dcUsers 实例对象
     * @return 实例对象
     */
    DcUsers update(DcUsers dcUsers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    void login(String userAccount, String password);

    void checkAccount(String userAccount);
}