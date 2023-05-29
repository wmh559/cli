package com.wmh.user.service;

import com.wmh.user.entity.dto.UserDto;

/**
 * @author wmh
 */
public interface UserService {

    /**
     * 新增用户
     * @param userDto
     * @return
     */
    Integer insertUser(UserDto userDto);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(int id);
}
