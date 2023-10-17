package com.hb.threadsafe;

public class BLogin extends Thread{
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b", "bb");
    }
}
