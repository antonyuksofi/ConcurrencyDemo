package concurrency.simple;

import concurrency.simple.MyRunnable;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);

        MyRunnable[] runnables = new MyRunnable[3];
        runnables[0] = new MyRunnable();
        runnables[1] = new MyRunnable("hi");
        runnables[2] = new MyRunnable("hello", 3);

        for (MyRunnable runnable : runnables) {
            try {
                runnable.thread.join();
                System.out.println("joined " + runnable.thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("main thread stopped");
    }
}
