package couplingDemoSpringIoc;

public class WebDataProvider implements UserDataProider {
    @Override
    public String getUserDetails() {

        return "fetching data from webdata";
    }
}
