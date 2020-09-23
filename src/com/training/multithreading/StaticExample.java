package com.training.multithreading;

/**
 * Created by punee on 22/9/20.
 */
public class StaticExample {

     public static String name;
    public static int telephone;
     public String age;

     static {
         System.out.println("This is static block");
          name = "Puneet";
         telephone = 1111;
     }

}
