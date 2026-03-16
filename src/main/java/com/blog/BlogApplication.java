package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
        System.out.println("========================================");
        System.out.println("博客社区启动成功！");
        System.out.println("访问地址：http://localhost:8080/api/swagger-ui/");
        System.out.println("========================================");
    }
}
