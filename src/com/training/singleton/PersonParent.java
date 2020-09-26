package com.training.singleton;

/**
 * Created by punee on 26/9/20.
 */
public class PersonParent {

    private String parentName;

    public PersonParent(){
        System.out.println("I am inside PersonParent constructor");
    }

    public PersonParent(String parentName){
        System.out.println("I am inside PersonParent param constructor");
        this.parentName = parentName;
    }

}
