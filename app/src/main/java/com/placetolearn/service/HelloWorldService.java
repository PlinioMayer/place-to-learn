package com.placetolearn.service;

public class HelloWorldService {
    private String theWords;

//    public HelloWorldService() {}
//
//    public HelloWorldService(AnotherService anotherService) throws InterruptedException {
//        anotherService.doCrazyStuff();
//    }

    public void sayTheWords() {
        System.out.println(theWords);
    }

    public void setTheWords(String theWords) {
        this.theWords = theWords;
    }
}
