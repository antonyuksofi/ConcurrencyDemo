package concurrency.simple;

public class MyRunnable implements Runnable {
    MyThread thread;

    public MyRunnable() {
        thread = new MyThread(this);
        thread.start();
    }

    public MyRunnable(String msg) {
        thread = new MyThread(this, msg);
        thread.start();
    }

    public MyRunnable(String msg, Integer secondsToSleep) {
        thread = new MyThread(this, msg, secondsToSleep);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("msg: " + thread.msg +
                "\t- name: " + thread.getName() +
                "\t- priority: " + thread.getPriority());
        if (thread.secondsToSleep != null) {
            try {
                Thread.sleep(thread.secondsToSleep * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

