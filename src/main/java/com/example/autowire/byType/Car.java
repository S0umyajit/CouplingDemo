package com.example.autowire.byType;

public class Car {
    private Specification specification;

    public void setSpecifications(Specification specification){
        this.specification=specification;
    }

    public void display(){

        System.out.println(specification.toString());
    }
}
