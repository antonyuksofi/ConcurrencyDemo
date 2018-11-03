package concurrency.semaphore;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedQueue {

    Queue<Integer> queue;
    int semaphore;

    public SharedQueue(int size) {
        queue = new ArrayDeque<>(size);
        semaphore = 0;
    }

    public synchronized int get() throws InterruptedException {
        while (semaphore == 0) {
            wait();
        }
        int result = queue.poll();
        semaphore--;
        System.out.println("polled " + result + "; queue size " + queue.size() + "; semaphore " + semaphore);
        notify();
        return result;
    }

    public synchronized void put(int newValue) throws InterruptedException {
        while (semaphore == 5) {
            wait();
        }
        queue.add(newValue);
        semaphore++;
        System.out.println("added " + newValue + "; queue size " + queue.size() + "; semaphore " + semaphore);
        notify();
    }
}
