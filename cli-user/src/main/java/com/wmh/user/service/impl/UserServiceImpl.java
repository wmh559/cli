package com.wmh.user.service.impl;

import com.wmh.user.entity.dto.UserDto;
import com.wmh.user.entity.po.UserPo;
import com.wmh.user.mapper.UserMapper;
import com.wmh.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wmh
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        int count = userMapper.insert(userPo);
        return count;
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteById(id);
    }
}
