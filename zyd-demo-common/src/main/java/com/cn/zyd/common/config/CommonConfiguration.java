package com.cn.zyd.common.config;

import com.cn.zyd.common.spring.SpringContextHolder;
import com.cn.zyd.common.util.MailUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyd
 * @date 2019/9/25 14:59
 * @desc
 */
@Configuration
public class CommonConfiguration {
    @Bean
    public SpringContextHolder initSpringContextHolder() {
        return new SpringContextHolder();
    }

    @Bean
    @ConditionalOnProperty("spring")
    public MailUtil mailUtil() {
        return new MailUtil();
    }
}