package couplingDemoSpringIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {

    public static void main(String[] args) {

        ApplicationContext context=new
                ClassPathXmlApplicationContext("applicationCouplingIOCInjectionContext.xml");

        UserInfo info= (UserInfo) context.getBean("userInfowithuserDatabase");

        System.out.println(info.getUserInfo());


    }
}
