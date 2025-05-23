package com.telusko;


import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();


//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt.compile();


//        ** XML CONFIG **

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.setAge(21);
//        System.out.println(obj.getAge());
//        obj.code();

//        Computer com = context.getBean(Computer.class);
//        Desktop obj1 = context.getBean("com", Desktop.class);
    }
}
