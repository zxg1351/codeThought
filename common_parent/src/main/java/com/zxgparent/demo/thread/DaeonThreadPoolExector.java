package com.zxgparent.demo.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
public class DaeonThreadPoolExector extends ThreadPoolExecutor {
    public DaeonThreadPoolExector() {
        super(0,Integer.MAX_VALUE,60L,TimeUnit.SECONDS,new SynchronousQueue<>(),new DaemonThreadFactory());
    }
}
