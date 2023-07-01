package designpattern.factorymethod;

public class DogToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("나는 테니스공!");
    }
}
