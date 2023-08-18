package com.example.mysql_demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/18
 */
@Data
public class User {
    
    private int id;

    private String name;
    
    private int sex;

    private Date birthday;
}
