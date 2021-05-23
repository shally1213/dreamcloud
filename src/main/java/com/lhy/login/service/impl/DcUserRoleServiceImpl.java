package com.lhy.login.service.impl;

import com.lhy.login.entity.DcUserRole;
import com.lhy.login.dao.DcUserRoleDao;
import com.lhy.login.service.DcUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcUserRole)表服务实现类
 *
 * @author makejava
 * @since 2021-05-22 22:40:36
 */
@Service("dcUserRoleService")
public class DcUserRoleServiceImpl implements DcUserRoleService {
    @Resource
    private DcUserRoleDao dcUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcUserRole findById(Integer id) {
        return this.dcUserRoleDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcUserRole> findAllLimit(int offset, int limit) {
        return this.dcUserRoleDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcUserRole 实例对象
     * @return 对象列表
     */
    @Override
    public List<DcUserRole> queryAll(DcUserRole dcUserRole){
        return this.dcUserRoleDao.queryAll(dcUserRole);
     }


    /**
     * 新增数据
     *
     * @param dcUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public DcUserRole insert(DcUserRole dcUserRole) {
        this.dcUserRoleDao.insert(dcUserRole);
        return dcUserRole;
    }

    /**
     * 修改数据
     *
     * @param dcUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public DcUserRole update(DcUserRole dcUserRole) {
        this.dcUserRoleDao.update(dcUserRole);
        return this.findById(dcUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcUserRoleDao.deleteById(id) > 0;
    }
}