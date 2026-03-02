package com.example.autowire.byType.java.couplingDemoSpringIoc;

public class UserInfo {
    private UserDataProider userDataProider;


    public UserInfo(UserDataProider userDataProider) {
        this.userDataProider = userDataProider;
    }

    public String getUserInfo(){

        return userDataProider.getUserDetails();
    }
}
