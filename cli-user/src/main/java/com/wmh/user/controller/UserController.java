package com.wmh.user.controller;

import com.wmh.bean.Result;
import com.wmh.user.entity.dto.UserDto;
import com.wmh.user.entity.req.UserReq;
import com.wmh.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        try {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userReq,userDto);
            Integer integer = userService.insertUser(userDto);
            return Result.ok(integer);
        } catch (Exception e) {
            return Result.fail();
        }
    }
}
