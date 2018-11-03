package concurrency.semaphore;

public class Demo {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(5);
        new Consumer(queue);
        new Producer(queue);
    }
}
