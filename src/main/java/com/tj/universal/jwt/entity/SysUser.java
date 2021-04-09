package com.tj.universal.jwt.entity;

import lombok.Data;

/**
 * @author TJ
 * @description TODO
 * @date 2021/1/25 16:19
 **/
@Data
public class SysUser {

    private String id;

    private String account;

    private String password;

    private String name;

    private String unit;

    private String unitSecondary;

    private String principalName;

    private String principalTel;

    private String files;

    private String isEffective;

    private String role;
}
