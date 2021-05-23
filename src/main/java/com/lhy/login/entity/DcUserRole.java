package com.lhy.login.entity;

import java.io.Serializable;

/**
 * (DcUserRole)实体类
 *
 * @author makejava
 * @since 2021-05-22 22:40:35
 */
public class DcUserRole implements Serializable {
    private static final long serialVersionUID = 884561314226847794L;
    
    private Integer id;
    
    private Integer roleId;
    
    private Integer userId;
    
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

}