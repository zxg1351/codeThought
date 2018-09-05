package com.zxgparent.demo.thread;

public class LiteOff implements Runnable {

    protected  int countDown =10;
    private static int taskCount = 0;
    private final  int id =taskCount++;

    public LiteOff() {
    }

    public LiteOff(int countDown) {
        this.countDown = countDown;
    }


    public String status(){

        return "#"+id+"("+(countDown>0?countDown:"LiftOff!")+")," ;
    }
    @Override
    public void run() {
            while (countDown-->0){
                System.out.println(status());
                Thread.yield();
            }
    }
}