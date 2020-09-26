package com.training.multithreading;

/**
 * Created by punee on 23/9/20.
 */
public class UserThread extends Thread {

    public UserThread(String name){
        super(name);
    }

    public void run(){

        Thread thread = Thread.currentThread();
        System.out.println("Starting of the thread name: "+thread.getName());

        System.out.println("End of run method: "+thread.getName());
    }
}
