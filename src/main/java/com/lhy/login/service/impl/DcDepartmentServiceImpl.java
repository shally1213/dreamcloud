package com.lhy.login.service.impl;

import com.lhy.login.entity.DcDepartment;
import com.lhy.login.dao.DcDepartmentDao;
import com.lhy.login.service.DcDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcDepartment)表服务实现类
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@Service("dcDepartmentService")
public class DcDepartmentServiceImpl implements DcDepartmentService {
    @Resource
    private DcDepartmentDao dcDepartmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcDepartment findById(Integer id) {
        return this.dcDepartmentDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcDepartment> findAllLimit(int offset, int limit) {
        return this.dcDepartmentDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcDepartment 实例对象
     * @return 对象列表
     */
     @Override
     public List<DcDepartment> queryAll(DcDepartment dcDepartment){
        return this.dcDepartmentDao.queryAll(dcDepartment);
     }


    /**
     * 新增数据
     *
     * @param dcDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public DcDepartment insert(DcDepartment dcDepartment) {
        this.dcDepartmentDao.insert(dcDepartment);
        return dcDepartment;
    }

    /**
     * 修改数据
     *
     * @param dcDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public DcDepartment update(DcDepartment dcDepartment) {
        this.dcDepartmentDao.update(dcDepartment);
        return this.findById(dcDepartment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcDepartmentDao.deleteById(id) > 0;
    }
}