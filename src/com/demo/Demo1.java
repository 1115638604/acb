package com.demo;

public class Demo1 extends Thread {

    public void run(){
        System.out.println("123....");
    }


    public static void main(String[] args) {

        new Demo1().run();
    }
}
