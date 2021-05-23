package com.lhy.login.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DcDepartment)实体类
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
public class DcDepartment implements Serializable {
    private static final long serialVersionUID = -66934399446767231L;
    
    private Integer id;
    
    private String name;
    
    private Date createTime;
    
    private Date delTime;
    
    private Integer delState;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

}