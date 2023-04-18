package com.wmh.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wmh.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

/**
 * @author wmh
 */
@Repository
public interface UserMapper extends BaseMapper<UserPo> {
}
