package com.example.autowire.byType.java.com.loose.coupling;

public class WebDataProvider implements UserDataProider {
    @Override
    public String getUserDetails() {
        return "fetching data from webdata";
    }
}
