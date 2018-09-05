package com.zxgparent.demo.thread;

public class BasicThread {

    public static void main(String[] args) {
        Thread t = new Thread(new LiteOff());
        t.start();
        System.out.println("Waiting for LiteOff");
    }
}
