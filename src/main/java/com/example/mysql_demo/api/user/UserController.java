package com.example.mysql_demo.api.user;

import com.example.mysql_demo.api.user.model.UserRole;
import com.example.mysql_demo.entity.User;
import com.example.mysql_demo.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.mysql_demo.model.ApiResponse.*;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public ApiResponse<List<User>> list() {
        return ok(userService.list());
    }

    @GetMapping("/find_by_id")
    public ApiResponse<User> findById(@RequestParam int id) {
        return ok(userService.findById(id));
    }
    
    @GetMapping("/find_by_id_with_role")
    public ApiResponse<UserRole> findByIdWithRole(@RequestParam int id) {
        return ok(userService.findByIdWithRole(id));
    }
}
