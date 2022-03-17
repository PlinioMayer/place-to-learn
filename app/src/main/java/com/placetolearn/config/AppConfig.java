package com.placetolearn.config;

import com.placetolearn.service.AnotherService;
import com.placetolearn.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AnotherService anotherService() {
        return new AnotherService(10);
    }

    @Bean
    public HelloWorldService helloWorldService(AnotherService anotherService) throws InterruptedException {
        HelloWorldService helloWorldService = new HelloWorldService(anotherService);
        helloWorldService.setTheWords("Hello World");
        return helloWorldService;
    }
}
