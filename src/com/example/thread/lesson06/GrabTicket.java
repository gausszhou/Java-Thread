package com.example.thread.lesson06;

/**
 * 实现一个抢票线程
 */

public class GrabTicket implements Runnable {

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.ticketNums <= 0) {
                break;
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "拿到了: " + this.ticketNums--);
        }
    }
}
