package com.placetolearn.resource;

import com.placetolearn.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldResource {

    private final HelloWorldService helloWorldService;

    public HelloWorldResource(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld() {
        return this.helloWorldService.getTheWords();
    }
}
