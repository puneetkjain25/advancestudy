package com.training.singleton;

/**
 * Created by punee on 26/9/20.
 */
public class SingletonMain {

    public static void main(String[] args) {

        IndianPrimeMinister indianPrimeMinister1 = IndianPrimeMinister.getIndianPrimeMinister();

        IndianPrimeMinister indianPrimeMinister2 = IndianPrimeMinister.getIndianPrimeMinister();

        System.out.println(indianPrimeMinister1 == indianPrimeMinister2);

        System.out.println("Name of PM1 is: "+indianPrimeMinister1.getName());
        System.out.println("Name of PM2 is: "+indianPrimeMinister2.getName());

    }
}
