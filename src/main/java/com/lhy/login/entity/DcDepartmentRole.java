package com.lhy.login.entity;

import java.io.Serializable;

/**
 * (DcDepartmentRole)实体类
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
public class DcDepartmentRole implements Serializable {
    private static final long serialVersionUID = -27571628252869338L;
    
    private Integer id;
    
    private Integer roleId;
    
    private Integer departmentId;
    
    private Integer companyId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

}