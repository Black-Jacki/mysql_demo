package com.example.mysql_demo.api.user;

import com.example.mysql_demo.api.user.model.UserRole;
import com.example.mysql_demo.entity.User;

import java.util.List;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/18
 */
public interface UserService {

    List<User> list();

    User findById(int id);

    UserRole findByIdWithRole(int id);
}
