package com.stranger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringbootRedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRedisApplication.class);

    }
}
