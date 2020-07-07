package com.manish.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorDependencyInjectionApplication {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring\\applicationContext.xml");

        // retrieve bean from spring container
        Coach thCoach = context.getBean("myCoach",Coach.class);

        System.out.println(thCoach.getDailyWorkOut());
        System.out.println(thCoach.getDailyFortune());
    }

}
