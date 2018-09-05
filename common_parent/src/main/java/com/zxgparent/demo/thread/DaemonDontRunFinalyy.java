package com.zxgparent.demo.thread;

public class DaemonDontRunFinalyy {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}
