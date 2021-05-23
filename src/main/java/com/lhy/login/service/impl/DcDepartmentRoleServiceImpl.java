package com.lhy.login.service.impl;

import com.lhy.login.entity.DcDepartmentRole;
import com.lhy.login.dao.DcDepartmentRoleDao;
import com.lhy.login.service.DcDepartmentRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcDepartmentRole)表服务实现类
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@Service("dcDepartmentRoleService")
public class DcDepartmentRoleServiceImpl implements DcDepartmentRoleService {
    @Resource
    private DcDepartmentRoleDao dcDepartmentRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcDepartmentRole findById(Integer id) {
        return this.dcDepartmentRoleDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcDepartmentRole> findAllLimit(int offset, int limit) {
        return this.dcDepartmentRoleDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcDepartmentRole 实例对象
     * @return 对象列表
     */
     List<DcDepartmentRole> queryAll(DcDepartmentRole dcDepartmentRole){
        return this.dcDepartmentRoleDao.queryAll(dcDepartmentRole);
     }


    /**
     * 新增数据
     *
     * @param dcDepartmentRole 实例对象
     * @return 实例对象
     */
    @Override
    public DcDepartmentRole insert(DcDepartmentRole dcDepartmentRole) {
        this.dcDepartmentRoleDao.insert(dcDepartmentRole);
        return dcDepartmentRole;
    }

    /**
     * 修改数据
     *
     * @param dcDepartmentRole 实例对象
     * @return 实例对象
     */
    @Override
    public DcDepartmentRole update(DcDepartmentRole dcDepartmentRole) {
        this.dcDepartmentRoleDao.update(dcDepartmentRole);
        return this.findById(dcDepartmentRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcDepartmentRoleDao.deleteById(id) > 0;
    }
}