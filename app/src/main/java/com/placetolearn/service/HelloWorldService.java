package com.placetolearn.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    private String theWords;

    public HelloWorldService() {}

    public HelloWorldService(AnotherService anotherService) throws InterruptedException {
        anotherService.doCrazyStuff();
    }

    public void sayTheWords() {
        System.out.println(theWords);
    }

    public void setTheWords(String theWords) {
        this.theWords = theWords;
    }

    public String getTheWords() {
        return this.theWords;
    }
}
