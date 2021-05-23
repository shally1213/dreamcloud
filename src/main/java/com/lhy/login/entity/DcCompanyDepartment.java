package com.lhy.login.entity;

import java.io.Serializable;

/**
 * (DcCompanyDepartment)实体类
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
public class DcCompanyDepartment implements Serializable {
    private static final long serialVersionUID = -23551717039920608L;
    
    private Integer id;
    
    private Integer companyId;
    
    private Integer departmentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}