package com.AkiTeam.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class RedisConfig {

    @Autowired
    private RedisTemplate redisTemplate;

    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){
        log.info("开始创建redis模板对象...");
        RedisTemplate redisTemplate = new RedisTemplate();
        //设置redis的连接工厂对象
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //设置redis key的序列化器
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }


    public List<LoginUser> getCacheObject(String redisKey) {
        //查询redis中是否存在数据
        List<LoginUser> list = (List<LoginUser>) redisTemplate.opsForValue().get(redisKey);
        if (list != null && list.size() >0){
            //如果存在，直接返回，无需查询数据库
            return list;
        }
        //如果不存在，查询数据库，将查询到的数据放入redis中
        //TODO 查询逻辑


        //将数据库查询到的数据添加到redis
        redisTemplate.opsForValue().set(redisKey,list);
        return list;
    }
}
