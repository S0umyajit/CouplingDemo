package com.example.autowire.byType.java.com.loose.coupling;

public class UserInfo {
    private UserDataProider userDataProider;


    public UserInfo(UserDataProider userDataProider) {
        this.userDataProider = userDataProider;
    }

    public String getUserInfo(){

        return userDataProider.getUserDetails();
    }
}
