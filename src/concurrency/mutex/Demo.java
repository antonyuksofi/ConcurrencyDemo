package concurrency.mutex;

public class Demo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new Consumer(resource);
        new Producer(resource);
    }
}
