package com.demo;

public class Demo {

    private static Demo demo = null;

    private Demo(){

    }

    public static Demo getDemo(){
        if(demo==null){
            demo = new Demo();

        }
        return demo;

    }

    public static void main(String[] args) {
        Demo demo = getDemo();
        System.out.println(demo==demo);
    }
}
