package com.lhy.login.entity;

import lombok.Data;

/**
 * @author lihongyan
 * @version 1.0
 * @date 2021/5/22 21:53
 */
@Data
public class User {

    private Long id;

    private String userName;

    private String phone;

    private String createTime;

    private String userAccount;

    private String password;

    private String userState;

    private Long createUserId;

    private Long roleId;

    private Long companyId;


}
