package com.oym.component.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangyd
 * @date 2019/11/18 11:21
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRedisApplication.class)
public class TestRedisService {
    @Autowired
    private RedisService redisService;

    @Test
    public void testLock() {
        System.out.println(redisService.tryLock("key1", "111", 200000));
        System.out.println(redisService.tryLock("key1", "111", 200000));
        System.out.println(redisService.tryUnLock("key1", "111"));
    }

}
