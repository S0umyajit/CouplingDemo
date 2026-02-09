package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
        UserDataProider userDataProiderDb=new UserDatabase();
        UserInfo userInfo=new UserInfo(userDataProiderDb);

        System.out.println(userInfo.getUserInfo());
        UserDataProider webUserData=new WebDataProvider();

        UserInfo userInfo1=new UserInfo(webUserData);

        System.out.println(userInfo1.getUserInfo());


    }
}
