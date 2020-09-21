package com.training.exceptionhandling;

/**
 * Created by punee on 20/9/20.
 */
public class RethrowExample {

    public static void main(String[] args) {

        int a = 0;
        try {
            a = divide(10,0);

            System.out.println("Main works successfully");
        } catch (Throwable e) {
            System.out.println("Problem occred in main");
        }

        System.out.println("value of a: "+a);
    }

    public static int divide(int a, int b) throws Exception{

        System.out.println("Divide is started");
        int c = 0;
        try {
            c = a/b;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Problem occured in divide.");
            throw e;
        }

        System.out.println("Divide is ended");

        return c;
    }

}
