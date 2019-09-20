package com.test.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@EnableDubbo
@SpringBootApplication
public class providerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(providerApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
