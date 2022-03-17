package com.placetolearn.service;

public class HelloWorldService {
    private String theWords;

    public void sayTheWords() {
        System.out.println(theWords);
    }

    public void setTheWords(String theWords) {
        this.theWords = theWords;
    }
}
