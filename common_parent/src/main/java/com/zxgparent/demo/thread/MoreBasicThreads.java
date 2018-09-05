package com.zxgparent.demo.thread;

public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiteOff()).start();
            System.out.println("Waiting for LiteOff");
        }

    }
}
