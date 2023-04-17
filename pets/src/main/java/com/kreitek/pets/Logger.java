package com.kreitek.pets;

public class Logger {
    private static int counter = 0;
    public void debug(String message) {
        System.out.println("[debug][" + ++counter + "] - " + message);
    }
}
