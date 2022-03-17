package com.placetolearn.service;

import java.util.Random;

public class AnotherService {
    private final int luckyNumber;

    public AnotherService(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public void doCrazyStuff() {
        System.out.println("Heavy computing...");
        int min = luckyNumber - 10;
        int max = luckyNumber + 10;
        Random random = new Random();

        while(true) {
            int randomInt = random.ints(min, max).findFirst().getAsInt();

            if (randomInt == luckyNumber) {
                System.out.println("Achei!!! " + randomInt);
                break;
            }

            System.out.println("Não achei ainda :( ... " + randomInt);
        }
    }
}
