package redis.init;

import org.springframework.stereotype.Component;

/**
 * @author wmh
 * 抽象缓存类
 */
@Component
public abstract class AbstractCache {

    /**
     * 缓存预热方法
     */
    public void init() {}

    /**
     * 删除缓存方法
     */
    public void clear() {}

    /**
     * 更新缓存方法
     */
    public void reset() {
        clear();
        init();
    }
}
