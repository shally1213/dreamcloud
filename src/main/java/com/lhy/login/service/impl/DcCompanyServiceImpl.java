package com.lhy.login.service.impl;

import com.lhy.login.entity.DcCompany;
import com.lhy.login.dao.DcCompanyDao;
import com.lhy.login.service.DcCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DcCompany)表服务实现类
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
@Service("dcCompanyService")
public class DcCompanyServiceImpl implements DcCompanyService {
    @Resource
    private DcCompanyDao dcCompanyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DcCompany findById(Integer id) {
        return this.dcCompanyDao.findById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DcCompany> findAllLimit(int offset, int limit) {
        return this.dcCompanyDao.findAllLimit(offset, limit);
    }
    
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param dcCompany 实例对象
     * @return 对象列表
     */
     @Override
     public List<DcCompany> queryAll(DcCompany dcCompany){
        return this.dcCompanyDao.queryAll(dcCompany);
     }


    /**
     * 新增数据
     *
     * @param dcCompany 实例对象
     * @return 实例对象
     */
    @Override
    public DcCompany insert(DcCompany dcCompany) {
        this.dcCompanyDao.insert(dcCompany);
        return dcCompany;
    }

    /**
     * 修改数据
     *
     * @param dcCompany 实例对象
     * @return 实例对象
     */
    @Override
    public DcCompany update(DcCompany dcCompany) {
        this.dcCompanyDao.update(dcCompany);
        return this.findById(dcCompany.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dcCompanyDao.deleteById(id) > 0;
    }
}