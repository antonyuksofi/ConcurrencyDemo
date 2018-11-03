package concurrency.semaphore;

public class Producer implements Runnable {
    SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
        new Thread(this, "ProducerThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
