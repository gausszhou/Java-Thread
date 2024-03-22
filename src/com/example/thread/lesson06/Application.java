package com.example.thread.lesson06;

/**
 * 多个线程操作同一个对象
 * 1. 共享
 * 2. 竞争
 */

public class Application {
    public static void main(String[] args) {
        GrabTicket grabTicket = new GrabTicket();
        new Thread(grabTicket, "小明").start();
        new Thread(grabTicket, "小红").start();
        new Thread(grabTicket, "班长").start();
        new Thread(grabTicket, "老师").start();
        new Thread(grabTicket, "黄牛党").start();
        /**
         * 发现问题：多个线程操作同一资源的情况下，线程不安全，数据紊乱
         * 老师拿到了: 10
         * 班长拿到了: 9
         * 小红拿到了: 8
         * 小明拿到了: 7
         * 黄牛党拿到了: 6
         * 小明拿到了: 5
         * 黄牛党拿到了: 4
         * 老师拿到了: 3
         * 班长拿到了: 2
         * 小红拿到了: 1
         * 小明拿到了: 0
         * 黄牛党拿到了: 0
         * 老师拿到了: -1
         * 班长拿到了: -1
         */

    }
}

