package couplingDemoSpringIoc;

public class UserDatabase implements UserDataProider {

    @Override
    public String getUserDetails(){

        return "getting user details from Db";
    }
}
