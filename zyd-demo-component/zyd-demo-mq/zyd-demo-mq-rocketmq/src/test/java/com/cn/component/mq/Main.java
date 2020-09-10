package com.cn.component.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zyd
 * @date 2019/11/21 14:31
 * @desc
 */
@SpringBootApplication(scanBasePackages = "com.cn.mq")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}