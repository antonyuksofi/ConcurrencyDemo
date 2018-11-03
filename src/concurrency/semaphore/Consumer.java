package concurrency.semaphore;

public class Consumer implements Runnable {
    SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
        new Thread(this, "ConsumerThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                sharedQueue.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
