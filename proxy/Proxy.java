package designpattern.proxy;

public class Proxy implements IService {
    IService service1;


    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 겨로가를 그대로 전달");

        service1 = new Service();
        return service1.runSomething();
    }
}
