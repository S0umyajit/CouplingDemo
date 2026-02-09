package com.tight.coupling;

public class UserInfo {
    private UserDatabase userDatabase=new UserDatabase();

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
