package com.hb;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myThreadA = new Thread(myThread, "A");
        Thread myThreadB = new Thread(myThread,"B");
        Thread myThreadC = new Thread(myThread, "C");
        Thread myThreadD = new Thread(myThread, "D");
        Thread myThreadE = new Thread(myThread, "E");

        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
        myThreadD.start();
        myThreadE.start();

        // MyRunnable myRunnable = new MyRunnable();
        // new Thread(myRunnable).start();
        // System.out.println("main over");

    }
}
