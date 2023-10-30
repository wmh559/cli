package redis.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 实现了ApplicationContextAware的类
 * spring会帮我们在setApplicationContext方法把ApplicationContext
 * 注入进来，在没有办法注入bean的时候可以通过实现ApplicationContextAware
 * 获取spring上下文对象获取bean
 * @author wmh
 */
@Component
public class SpringContextUtil implements ApplicationContextAware{

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return context;
    }

    public static Object getBean(Class type){
        return context.getBean(type);
    }
}
