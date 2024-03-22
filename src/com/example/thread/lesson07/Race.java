package com.example.thread.lesson07;

public class Race implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                i  = i + 9;
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
            boolean flag = this.gameOver(i);
            if (flag) {
                break;
            }
        }
    }

    private boolean gameOver(int step) {
        if (winner != null) {
            return true;
        }
        if (step >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("获胜者是" + winner);
            return true;
        }
        return false;
    }
}
