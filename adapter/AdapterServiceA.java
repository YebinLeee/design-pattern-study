package designpattern.adapter;

public class AdapterServiceA {
    ServiceA s1 = new ServiceA();

    void runService() {
        s1.runServiceA();
    }
}
