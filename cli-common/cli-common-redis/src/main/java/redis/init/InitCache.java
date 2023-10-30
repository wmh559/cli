package redis.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.util.CollectionUtils;
import redis.util.SpringContextUtil;

import java.util.Map;

/**
 * 缓存预热实现类
 * @author wmh
 */
public class InitCache implements CommandLineRunner {

    /**
     * 启动时运行
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
        Map<String, AbstractCache> beansOfType = applicationContext.getBeansOfType(AbstractCache.class);
        if (CollectionUtils.isEmpty(beansOfType)) {
            return;
        }
        for (Map.Entry<String,AbstractCache> entry:beansOfType.entrySet()) {
            AbstractCache bean = applicationContext.getBean(entry.getValue().getClass());
            bean.init();
        }
    }
}
