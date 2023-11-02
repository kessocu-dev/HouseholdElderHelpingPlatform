package com.AkiTeam.controller;

import com.AkiTeam.common.R;
import com.AkiTeam.entity.User;
import com.AkiTeam.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "用户模块")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    @Operation(summary = "登录")
    public R login(@RequestBody User user) {
        return userService.login(user);
    }

}
