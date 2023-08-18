package com.example.mysql_demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/19
 */
@Data
public class Role {
    
    private int id;
    
    private String name;

    private String key;

    private Date createTime;
    
    private Date updateTime;
}
