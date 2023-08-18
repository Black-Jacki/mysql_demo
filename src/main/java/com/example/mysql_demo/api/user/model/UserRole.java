package com.example.mysql_demo.api.user.model;

import com.example.mysql_demo.entity.Role;
import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/19
 */
@Data
public class UserRole {

    private int userId;

    private String userName;

    private String sex;

    private Date birthday;

    private Set<Role> roles;
}
