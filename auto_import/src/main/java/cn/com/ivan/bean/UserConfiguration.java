package cn.com.ivan.bean;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {

    @Bean
    private User getUser(){
        return new User();
    }
}
