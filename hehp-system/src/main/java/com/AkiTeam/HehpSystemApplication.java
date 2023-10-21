package com.AkiTeam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.AkiTeam.mapper"})
public class HehpSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(HehpSystemApplication.class,args);
    }
}