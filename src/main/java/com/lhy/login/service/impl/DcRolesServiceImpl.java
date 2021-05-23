package com.lhy.login.service.impl;

import com.lhy.login.entity.DcRoles;
import com.lhy.login.dao.DcRolesDao;
import com.lhy.login.service.DcRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcRoles)表服务实现类
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@Service("dcRolesService")
public class DcRolesServiceImpl implements DcRolesService {
    @Resource
    private DcRolesDao dcRolesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcRoles findById(Integer id) {
        return this.dcRolesDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcRoles> findAllLimit(int offset, int limit) {
        return this.dcRolesDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcRoles 实例对象
     * @return 对象列表
     */
     @Override
     public List<DcRoles> queryAll(DcRoles dcRoles){
        return this.dcRolesDao.queryAll(dcRoles);
     }


    /**
     * 新增数据
     *
     * @param dcRoles 实例对象
     * @return 实例对象
     */
    @Override
    public DcRoles insert(DcRoles dcRoles) {
        this.dcRolesDao.insert(dcRoles);
        return dcRoles;
    }

    /**
     * 修改数据
     *
     * @param dcRoles 实例对象
     * @return 实例对象
     */
    @Override
    public DcRoles update(DcRoles dcRoles) {
        this.dcRolesDao.update(dcRoles);
        return this.findById(dcRoles.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcRolesDao.deleteById(id) > 0;
    }
}