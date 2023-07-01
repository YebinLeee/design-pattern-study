package designpattern.adapter;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA sA = new ServiceA();
        ServiceB sB = new ServiceB();

        sA.runServiceA();
        sB.runServiceB();
    }
}
