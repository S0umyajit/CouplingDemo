package com.example.autowire.byType.java.car.example.constructor.injection;

public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification=specification;
    }

    public void display(){
        System.out.println(specification);
    }
}
