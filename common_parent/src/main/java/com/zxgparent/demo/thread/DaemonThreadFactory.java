package com.zxgparent.demo.thread;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread tr = new Thread(r);
        tr.setDaemon(true);
        return tr;
    }
}
