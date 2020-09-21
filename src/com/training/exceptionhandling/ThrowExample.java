package com.training.exceptionhandling;

/**
 * Created by punee on 20/9/20.
 */
public class ThrowExample {

    public static void main(String[] args) {

        String name = "puneet";

        try{

            System.out.println("Starting");

            if(name.equals("puneet")){
                 throw (new ArithmeticException("Name was puneet"));
            }

            System.out.println("abc");
            System.out.println("pqr");

            System.out.println("Ending");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Situation under control");
        }

    }
}
