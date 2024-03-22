package com.example.thread.lesson04;

/**
 * 实现 Runnable 来创建线程
 * 继承 Thread 就是实现了 Runnable
 * 推荐使用此方式创建线程，因为 Java 只能实现单继承，此方式更具备扩展性
 */

public class Application {
    public static void main(String[] args) {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        Thread simpleThread = new Thread(simpleRunnable);
        simpleThread.start();
    }
}
