package com.itmuch.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//扫描mybatis哪些包里边的接口
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.itmuch")
@SpringBootApplication
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}
