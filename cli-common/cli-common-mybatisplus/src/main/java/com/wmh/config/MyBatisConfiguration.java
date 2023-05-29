package com.wmh.config;

import com.wmh.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wmh
 */
@Configuration
public class MyBatisConfiguration {

    @Bean
    //设置sql打印，可以在配置文件配置sqlInteceptor.enabled控制
    @ConditionalOnProperty(name = {"sqlInteceptor.enabled"},havingValue = "true", matchIfMissing = true)
    public SqlBeautyInterceptor sqlBeautyInterceptor() {
        return new SqlBeautyInterceptor();
    }
}
