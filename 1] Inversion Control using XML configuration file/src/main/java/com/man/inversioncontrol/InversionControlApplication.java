package com.man.inversioncontrol;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

    public static void main(String[] args) {
        //SpringApplication.run(InversionControlUsingXmlConfigApplication.class, args);

        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring\\applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkOut());

        // close the context
        context.close();
    }

}
