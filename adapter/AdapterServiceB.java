package designpattern.adapter;

public class AdapterServiceB {
    ServiceB sB = new ServiceB();

    void runService() {
        sB.runServiceB();
    }
}
