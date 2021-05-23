package com.lhy.login.service.impl;

import com.lhy.login.entity.DcUsers;
import com.lhy.login.dao.DcUsersDao;
import com.lhy.login.service.DcUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcUsers)表服务实现类
 *
 * @author makejava
 * @since 2021-05-23 20:59:11
 */
@Service("dcUsersService")
public class DcUsersServiceImpl implements DcUsersService {
    @Resource
    private DcUsersDao dcUsersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcUsers findById(Integer id) {
        return this.dcUsersDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcUsers> findAllLimit(int offset, int limit) {
        return this.dcUsersDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcUsers 实例对象
     * @return 对象列表
     */
     List<DcUsers> queryAll(DcUsers dcUsers){
        return this.dcUsersDao.queryAll(dcUsers);
     }


    /**
     * 新增数据
     *
     * @param dcUsers 实例对象
     * @return 实例对象
     */
    @Override
    public DcUsers insert(DcUsers dcUsers) {
        this.dcUsersDao.insert(dcUsers);
        return dcUsers;
    }

    /**
     * 修改数据
     *
     * @param dcUsers 实例对象
     * @return 实例对象
     */
    @Override
    public DcUsers update(DcUsers dcUsers) {
        this.dcUsersDao.update(dcUsers);
        return this.findById(dcUsers.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcUsersDao.deleteById(id) > 0;
    }
}