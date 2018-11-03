package concurrency.semaphore;

public class Demo {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(5);
        Consumer consumer1 = new Consumer(queue);
//        Consumer consumer2 = new Consumer(queue);
        Producer producer1 = new Producer(queue);
//        Producer producer2 = new Producer(queue);
    }
}
