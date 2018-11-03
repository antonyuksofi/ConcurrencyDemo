package concurrency.synchronizeddemo;

public class Resource {
    String name;

    public Resource(String name) {
        this.name = name;
    }

    public /*synchronized*/ void performSomeOperation() {
        for (int counter = 0; counter < 5; counter++) {
            System.out.println(counter + " operation with resource " + name);
        }
    }
}
