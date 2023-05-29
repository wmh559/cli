package com.wmh.user.controller;

import com.wmh.bean.Result;
import com.wmh.user.entity.dto.UserDto;
import com.wmh.user.entity.req.UserReq;
import com.wmh.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wmh
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Result addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        Integer integer = userService.insertUser(userDto);
        int i = 1/0;
        return Result.ok(integer);
    }

    @DeleteMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return Result.ok();
    }
}
