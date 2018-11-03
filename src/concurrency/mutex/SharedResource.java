package concurrency.mutex;

public class SharedResource {
    private int value;
    private boolean valueSet = false;

    public synchronized int get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        int result = value;
        valueSet = false;
        System.out.println("get " + value);
        notify();
        return result;
    }

    public synchronized void put(int newValue) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        value = newValue;
        valueSet = true;
        System.out.println("put " + value);
        notify();
    }
}
