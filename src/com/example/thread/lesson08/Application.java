package com.example.thread.lesson08;

import java.util.concurrent.*;

/**
 * callable 的好处
 * 1. 可以定义返回值
 * 2. 抛出异常
 */
public class Application {
    public static void main(String[] args) {
        SimpleCallable s1 = new SimpleCallable();
        SimpleCallable s2 = new SimpleCallable();
        SimpleCallable s3 = new SimpleCallable();
        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Object> r1 = executorService.submit(s1);
        Future<Object> r2 = executorService.submit(s2);
        Future<Object> r3 = executorService.submit(s3);
        try {
            // 获取结果
            Object rs1 = r1.get();
            Object rs2 = r2.get();
            Object rs3 = r3.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
