package com.hb.threadsafe;

public class TestRun {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
//        System.out.println("main begin t1 alive: " + t1.isAlive());
        t1.setName("A");
        t1.start();
//        System.out.println("main end t1 alive: " + t1.isAlive());
    }
}
