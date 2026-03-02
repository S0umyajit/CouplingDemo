package com.example.componentScanAutowired;

//import com.example.componentScanAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Autowired
    private Employee employee;


//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                "employee=" + employee +
//                '}';
//    }
    public String toString(){
        return "manager: "+employee.toString();
    }
}
