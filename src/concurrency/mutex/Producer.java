package concurrency.mutex;

public class Producer implements Runnable {
    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
        new Thread(this, "ProducerThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sharedResource.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
