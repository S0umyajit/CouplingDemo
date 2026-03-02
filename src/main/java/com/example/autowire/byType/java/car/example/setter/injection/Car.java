package com.example.autowire.byType.java.car.example.setter.injection;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification){
        this.specification=specification;
    }

    public void display(){
        System.out.println(specification);
    }
}
