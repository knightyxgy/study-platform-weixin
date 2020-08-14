package com.yxgy.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yxgy.wexin.mapper")
public class StudyPlatformWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyPlatformWeixinApplication.class, args);
    }

}
