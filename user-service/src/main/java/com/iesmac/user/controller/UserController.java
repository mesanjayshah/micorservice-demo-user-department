package com.iesmac.user.controller;

import com.iesmac.user.entity.UserAdmin;
import com.iesmac.user.service.UserService;
import com.iesmac.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserAdmin saveUser(@RequestBody UserAdmin userAdmin) {
        return userService.saveUser(userAdmin);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long id) {
        return userService.getUserWithDepartment(id);
    }

}
