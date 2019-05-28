package com.demo;

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread thread = new Thread(test);
        thread.start();

        for (int i = 0; i <3 ; i++) {
            System.out.println("我是main方法");
            System.out.println("我是第二个main方法");
            System.out.println("我是第二个main方法");
            System.out.println("我是第三个main方法");
            System.out.println("我是第四个main方法");
        }
    }


    static class ThreadTest implements Runnable{

        @Override
        public void run() {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for (int i = 0; i <3 ; i++) {
                System.out.println("我是线程");
            }
        }

    }
}
