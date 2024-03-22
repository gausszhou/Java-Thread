package com.example.thread.lesson02;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i< 1000; i++){
            System.out.println("SimpleThread.run---" + i);
        }
    }
}
