package com.example.mysql_demo.mapper;

import com.example.mysql_demo.entity.User;
import com.example.mysql_demo.mapper.model.UserWithRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/18
 */
@Mapper
public interface UserRepository {

    List<User> list();

    User findById(int id);

    List<UserWithRole> findByIdWithRole(int id);
}
