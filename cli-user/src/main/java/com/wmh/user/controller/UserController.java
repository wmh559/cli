package com.wmh.user.controller;

import com.wmh.bean.Result;
import com.wmh.user.convert.UserConvert;
import com.wmh.user.entity.dto.UserDto;
import com.wmh.user.entity.req.UserReq;
import com.wmh.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wmh
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Resource
    private RedisTemplate redisTemplate;

    @PostMapping("/addUser")
    public Result addUser(@RequestBody UserReq userReq) {
//        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(userReq,userDto);
        UserDto userDto = UserConvert.INSTANCE.reqToDto(userReq);
        Integer integer = userService.insertUser(userDto);
//        int i = 1/0;
        return Result.ok(integer);
    }

    @DeleteMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return Result.ok();
    }

    @GetMapping("/test")
    public void TestRedis() {
        redisTemplate.opsForValue().set("test", "test");
        System.out.println(redisTemplate.opsForValue().get("test"));
    }
}
