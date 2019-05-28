package com.demo;

public class Demo2 {

    private static Demo2 demo = new Demo2();

    private Demo2(){

    }

    private static Demo2 getDemo(){
        return demo;
    }
}
