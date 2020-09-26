package com.training.multithreading;

public class RunnableDemo implements Runnable {
    private String threadName;

    RunnableDemo(String name) {
        this.threadName = name;
    }

    public void run() {

        System.out.println("inside run method " + this.threadName);
        System.out.println("inside run method " + this.threadName+" "+ RandomValueUtility.randomGenerator());
    }

}
