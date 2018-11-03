package concurrency.mutex;

public class Consumer implements Runnable {
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
        new Thread(this, "ConsumerThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sharedResource.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
