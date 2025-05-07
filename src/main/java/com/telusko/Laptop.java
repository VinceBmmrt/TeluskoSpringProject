package com.telusko;

public class Laptop implements Computer {
//    public Laptop() {
//        System.out.println("Laptop Object created");
//    }

    @Override
    public void compile() {
        System.out.println("compiling with laptop");
    }
}
