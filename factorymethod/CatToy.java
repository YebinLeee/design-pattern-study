package designpattern.factorymethod;

public class CatToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("나는 캣타워!");
    }
}
