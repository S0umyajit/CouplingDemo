package com.example.autowire.byType;

public class Specification {
    private String name;

    private String model;

    public void setName(String name) {
        this.name = name;
    }

    public void setModels(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}