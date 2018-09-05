package com.zxgparent.demo.thread;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepTask extends LiteOff {
    @Override
    public void run() {
        while (countDown-->0){

            try {
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }

    public static void main(String[] args) {
        ExecutorService exec  = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepTask());
        }
        exec.shutdown();
    }
}
