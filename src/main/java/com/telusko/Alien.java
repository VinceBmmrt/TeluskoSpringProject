package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Laptop lap = new Laptop();


    public Alien() {
        System.out.println("Object created");
    }

    @ConstructorProperties({"age", "lap"})
    public Alien(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {

        System.out.println("Coding..");
        lap.compile();
    }

}
