package concurrency.mutex;

public class Demo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Consumer consumer = new Consumer(resource);
        Producer producer = new Producer(resource);
    }
}
