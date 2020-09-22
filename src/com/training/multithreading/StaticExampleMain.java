package com.training.multithreading;

/**
 * Created by punee on 22/9/20.
 */
public class StaticExampleMain {

    public static void main(String[] args) {

        System.out.println("name is: "+StaticExample.name);
        System.out.println("age is: "+new StaticExample().age);

    }
}
