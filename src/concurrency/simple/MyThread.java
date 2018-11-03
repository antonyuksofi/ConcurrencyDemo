package concurrency.simple;

public class MyThread extends Thread{
    String msg;
    Integer secondsToSleep;

    MyThread(Runnable target) {
        super(target);
    }

    MyThread(Runnable target, String msg) {
        super(target);
        this.msg = msg;
    }

    MyThread(Runnable target, String msg, Integer secondsToSleep) {
        super(target);
        this.msg = msg;
        this.secondsToSleep = secondsToSleep;
    }
}
