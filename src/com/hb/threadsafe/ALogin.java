package com.hb.threadsafe;

public class ALogin extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a", "aa");
    }
}
