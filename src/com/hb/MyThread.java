package com.hb;

public class MyThread extends Thread {
    private int count = 5;
//    public MyThread(String name) {
//        super();
//        this.setName(name);
//    }
    @Override
    public void run() {
//        super.run();
        count --;
        System.out.println(this.currentThread().getName() + "-count = " + count);
    }
}
