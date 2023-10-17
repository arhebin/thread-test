package com.hb.threadsafe;

public class CountOperate extends Thread{
    @Override
    public void run() {
        System.out.println("run begin");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(this.getName());
        System.out.println(this.isAlive());
        System.out.println("run end");
    }
}
