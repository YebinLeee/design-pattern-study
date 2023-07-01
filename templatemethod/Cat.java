package designpattern.templatemethod;

import designpattern.factorymethod.DogToy;

public class Cat extends Animal {
    @Override
    protected DogToy play() {
        System.out.println("야옹~야옹");
        return null;
    }

    @Override
    void runSomething() {
        super.runSomething();
        System.out.println("꼬리 살랑살랑~");
    }
}
