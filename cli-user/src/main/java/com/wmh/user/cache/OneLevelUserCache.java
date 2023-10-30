package com.wmh.user.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.init.AbstractCache;
import redis.util.RedisUtil;

/**
 * 用户缓存
 * @author wmh
 */
@Component
public class OneLevelUserCache extends AbstractCache {

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void init() {
        redisUtil.set("oneLevelUserName","OneLevelUserName");
    }

    @Override
    public void clear() {
        redisUtil.del("oneLevelUserName");
    }
}
