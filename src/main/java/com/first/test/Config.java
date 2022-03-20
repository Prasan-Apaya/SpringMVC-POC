package com.first.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Company.class,Address.class})
public class Config {
    @Bean
    public Person getPerson() {
        return new Person("zxcv");
    }
}
