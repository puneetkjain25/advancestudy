package com.training.singleton;

/**
 * Created by punee on 26/9/20.
 */
public class Person extends PersonParent {

    private String name;

    public Person(){
        super();
        System.out.println("I am inside Person constructor");
    }

    public Person(String name){
        super(name);
        System.out.println("I am inside Person param constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
