package com.wmh.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wmh.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

/**
 * @author wmh
 */
@Repository
public interface UserMapper extends BaseMapper<UserPo> {

    /**
     * 分页获取用户
     * @param page
     * @return
     */
    IPage<UserPo> getUserPage(IPage<UserPo> page);

}
