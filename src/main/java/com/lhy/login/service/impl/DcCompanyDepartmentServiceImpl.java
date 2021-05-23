package com.lhy.login.service.impl;

import com.lhy.login.entity.DcCompanyDepartment;
import com.lhy.login.dao.DcCompanyDepartmentDao;
import com.lhy.login.service.DcCompanyDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcCompanyDepartment)表服务实现类
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
@Service("dcCompanyDepartmentService")
public class DcCompanyDepartmentServiceImpl implements DcCompanyDepartmentService {
    @Resource
    private DcCompanyDepartmentDao dcCompanyDepartmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcCompanyDepartment findById(Integer id) {
        return this.dcCompanyDepartmentDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcCompanyDepartment> findAllLimit(int offset, int limit) {
        return this.dcCompanyDepartmentDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcCompanyDepartment 实例对象
     * @return 对象列表
     */
    @Override
     public List<DcCompanyDepartment> queryAll(DcCompanyDepartment dcCompanyDepartment){
        return this.dcCompanyDepartmentDao.queryAll(dcCompanyDepartment);
     }


    /**
     * 新增数据
     *
     * @param dcCompanyDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public DcCompanyDepartment insert(DcCompanyDepartment dcCompanyDepartment) {
        this.dcCompanyDepartmentDao.insert(dcCompanyDepartment);
        return dcCompanyDepartment;
    }

    /**
     * 修改数据
     *
     * @param dcCompanyDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public DcCompanyDepartment update(DcCompanyDepartment dcCompanyDepartment) {
        this.dcCompanyDepartmentDao.update(dcCompanyDepartment);
        return this.findById(dcCompanyDepartment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcCompanyDepartmentDao.deleteById(id) > 0;
    }
}