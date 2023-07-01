package designpattern.templatemethod;

import designpattern.factorymethod.DogToy;

public class Dog extends Animal {
    // 추상 메서드 오버라이딩
    @Override
    protected DogToy play() {
        System.out.println("멍~!멍~!");
        return null;
    }

    @Override
    void runSomething() {
        System.out.println("꼬리 살랑살랑~");
    }
}
