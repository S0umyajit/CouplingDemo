package com.example.autowire.name;
public class Car {
    private Specification specification;

    public void setSpecifications(Specification specification){
        this.specification=specification;
    }

    public void display(){

        System.out.println(specification.toString());
    }
}
