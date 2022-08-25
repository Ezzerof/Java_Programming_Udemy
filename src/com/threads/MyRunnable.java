package com.threads;

import static com.threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable, implementation for run");
    }
}
