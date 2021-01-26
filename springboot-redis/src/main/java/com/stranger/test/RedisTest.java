package com.stranger.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("user1","test",1,TimeUnit.MINUTES);
        System.out.println(redisTemplate.opsForValue().get("user1"));
    }
}
