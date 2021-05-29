package com.lhy.login.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DcRoles)实体类
 *
 * @author lihongyan
 * @since 2021-05-22 22:40:35
 */
public class DcRoles implements Serializable {
    private static final long serialVersionUID = -37341768404676116L;
    
    private Integer id;

    private  String name;
    
    private Integer state;
    
    private Date createTime;
    
    private Date withdrawTime;
    
    private Integer delState;
    
    private Integer parentId;



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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}