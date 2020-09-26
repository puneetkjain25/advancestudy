package com.training.multithreading;

public class RunnableDemoMain {
    public static void main(String[] args) {
        RunnableDemo objRunnableDemo = new RunnableDemo("Thread1");
        Thread th = new Thread(objRunnableDemo);
        th.start();
        RunnableDemo objRunnableDemo2 = new RunnableDemo("Thread2");
        Thread th2 = new Thread(objRunnableDemo2);
        th2.start();
    }
}
