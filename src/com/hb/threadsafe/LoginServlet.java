package com.hb.threadsafe;

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;

            if (username.equals("a")) {
                Thread.sleep(500);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + ";password = " + passwordRef);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
