package designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

    }
}
