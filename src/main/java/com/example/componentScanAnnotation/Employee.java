package com.example.componentScanAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

    @Value("Soumyajit")
    private String name;
    @Value("ITEmployee")
    private String role;
    @Value("#{4*4}")
    private int salary;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "name: "+name +" role: "+role +" salary: "+salary;
    }
}
