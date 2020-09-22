package com.training.multithreading;

/**
 * Created by punee on 22/9/20.
 */
public class StaticExample {

     public static String name;
     public String age;

     static {
         System.out.println("This is static block");
         String name1 = "Puneet";
         Thread th = Thread.currentThread();
         System.out.println("Class StaticExample is loaded by "+th.getName()+" thread");

         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         System.out.println("This is static block end");
     }

}
