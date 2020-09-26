package com.training.multithreading;

import java.util.Random;

public class RandomValueUtility {
    private static int randomNumber;

    static {
        randomNumber = 10;
        System.out.println("inside static block");
    }


    public static long randomGenerator() {
        //Random objRandom = new Random();

        System.out.println("inside static block");
        //return objRandom.nextLong();
        synchronized (RandomValueUtility.class){
            randomNumber ++;

        }

        return randomNumber ;
    }
}
