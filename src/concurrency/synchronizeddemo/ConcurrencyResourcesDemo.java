package concurrency.synchronizeddemo;

public class ConcurrencyResourcesDemo {

    public static void main(String[] args) {
        Resource resource = new Resource("my_simple_resource");

        MyRunnableWithResources[] myRunnableWithResources = new MyRunnableWithResources[2];
        myRunnableWithResources[0] = new MyRunnableWithResources(resource);
        myRunnableWithResources[1] = new MyRunnableWithResources(resource);
    }
}
