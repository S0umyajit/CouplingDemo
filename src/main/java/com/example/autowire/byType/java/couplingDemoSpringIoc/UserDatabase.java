package com.example.autowire.byType.java.couplingDemoSpringIoc;

public class UserDatabase implements UserDataProider {

    @Override
    public String getUserDetails(){

        return "getting user details from Db";
    }
}
