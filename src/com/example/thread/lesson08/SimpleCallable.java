package com.example.thread.lesson08;

import java.util.concurrent.Callable;

public class SimpleCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("SimpleCallable.call");
        return null;
    }
}
