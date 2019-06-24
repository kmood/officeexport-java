package com.project.redis.service;

import com.project.basic.entity.FjModul;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: SunBC
 * @Date: 2019/3/18 14:34
 * @Description:
 */
//@Configuration
public class TestSpringConfiguration {
    public TestSpringConfiguration(){
        System.out.println("容器启动");
    }
    @Bean
    public FjModul fjModul(){
        FjModul fjModul = new FjModul();
        fjModul.setID("test");
        fjModul.setFWL(10);
        fjModul.setName("test");
        return fjModul;
    }
}
