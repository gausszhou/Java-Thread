package com.example.thread.lesson02;

/**
 * 创建线程的三种方式
 * 1. 继承 Thread class
 * 2. 实现 Runnable 接口
 * 3. 实现 Callable 接口
 */

public class Application {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        for (int i = 0; i< 1000; i++){
            System.out.println("Application.main---" + i);
        }
        // 顺序不能保证
        // Application.main---0
        // Application.main---1
        // Application.main---2
        // Application.main---3
        // SimpleThread.run---0
        // SimpleThread.run---1
        // SimpleThread.run---2
        // ...
        // SimpleThread.run---194
        // Application.main---4
        // Application.main---5
        // Application.main---6
    }
}
