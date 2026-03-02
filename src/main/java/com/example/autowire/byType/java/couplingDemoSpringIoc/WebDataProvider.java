package com.example.autowire.byType.java.couplingDemoSpringIoc;

public class WebDataProvider implements UserDataProider {
    @Override
    public String getUserDetails() {

        return "fetching data from webdata";
    }
}
