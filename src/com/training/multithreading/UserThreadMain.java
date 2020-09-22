package com.training.multithreading;

/**
 * Created by punee on 23/9/20.
 */
public class UserThreadMain {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println("Starting of the thread name: "+thread.getName());

        UserThread userThread = new UserThread("userthread");

        userThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method: "+thread.getName());
    }

}
