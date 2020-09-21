package com.training.exceptionhandling;

/**
 * Created by punee on 19/9/20.
 */
public class AirthmaticExceptionExample {

    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("I have handled arrayindex bound");
        }catch (ArithmeticException e){
              e.printStackTrace();
             System.out.println("I have handled airthmetic exception");
        }catch (Exception e){
            System.out.println("I have handled");
        }

        System.out.println("Finishing the program");
    }
}
