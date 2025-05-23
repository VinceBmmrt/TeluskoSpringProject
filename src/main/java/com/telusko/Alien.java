package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("25")
    private int age;

    @Autowired
//    @Qualifier("com2")
    private Computer com;


    public Alien() {
//        System.out.println("Object created");
    }

//    @ConstructorProperties({"age", "com"})
//    public Alien(Computer com, int age) {
//        this.com = com;
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }


    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {

        System.out.println("Coding..");
        com.compile();
    }

}
