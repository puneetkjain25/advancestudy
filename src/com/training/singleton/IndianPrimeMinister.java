package com.training.singleton;

/**
 * Created by punee on 26/9/20.
 */
public class IndianPrimeMinister {

    private static IndianPrimeMinister indianPrimeMinister = null;
    private String name;

    private IndianPrimeMinister() {
        name = "Anonymous";
    }

    public String getName() {
        return name;
    }

    public static IndianPrimeMinister getIndianPrimeMinister() {

        if (indianPrimeMinister == null) {
              indianPrimeMinister = new IndianPrimeMinister();
        }

        return indianPrimeMinister;
    }

}
