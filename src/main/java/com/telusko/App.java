package com.telusko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = context.getBean("alien", Alien.class);
        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

//        Computer com = context.getBean(Computer.class);
//        Desktop obj1 = context.getBean("com", Desktop.class);
    }
}
