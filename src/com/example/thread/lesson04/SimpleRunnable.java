package com.example.thread.lesson04;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("SimpleRunnable.run---" + i);
        }
    }
}
