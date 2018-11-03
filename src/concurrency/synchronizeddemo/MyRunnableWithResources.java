package concurrency.synchronizeddemo;

public class MyRunnableWithResources implements Runnable{
    Resource resource;
    Thread thread;

    public MyRunnableWithResources(Resource resource) {
        this.resource = resource;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
//        synchronized (resource) {
            resource.performSomeOperation();
//        }
    }
}
