package com.example.mysql_demo.api.user;

import com.example.mysql_demo.api.user.model.UserRole;
import com.example.mysql_demo.entity.Role;
import com.example.mysql_demo.entity.User;
import com.example.mysql_demo.mapper.UserRepository;
import com.example.mysql_demo.mapper.model.UserWithRole;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/18
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> list() {
        return userRepository.list();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserRole findByIdWithRole(int id) {
        List<UserWithRole> userWithRoles = userRepository.findByIdWithRole(id);
        
        if (CollectionUtils.isEmpty(userWithRoles)) return null;

        UserRole ret = new UserRole();
        Set<Role> roles = new HashSet<>();

        for (UserWithRole userWithRole : userWithRoles) {
            Role role = new Role();
            role.setId(userWithRole.getRoleId());
            role.setName(userWithRole.getRoleName());
            role.setKey(userWithRole.getRoleKey());
            roles.add(role);
        }
        BeanUtils.copyProperties(userWithRoles.get(0), ret);
        ret.setSex(userWithRoles.get(0).getSex() == 0 ? "女" : "男");
        ret.setRoles(roles);
        
        return ret;
    }
}
