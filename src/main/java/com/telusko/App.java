package com.telusko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();


        Desktop obj1 = (Desktop) context.getBean("com");
    }
}
