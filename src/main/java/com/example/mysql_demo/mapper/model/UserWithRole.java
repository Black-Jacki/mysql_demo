package com.example.mysql_demo.mapper.model;

import lombok.Data;

import java.util.Date;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/19
 */
@Data
public class UserWithRole {

    private int userId;

    private String userName;
    
    private int sex;

    private Date birthday;

    private int roleId;

    private String roleName;
    
    private String roleKey;
}
