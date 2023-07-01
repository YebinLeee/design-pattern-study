package designpattern.decorator;

public class Proxy implements IService {
    IService service1;


    @Override
    public String runSomething() {
        System.out.println("호출에 대한 장식 주목적, 클라이언트에게 반환 결과에 장식을 덧입혀 전달");

        service1 = new Service();
        return "정말" + service1.runSomething();

    }
}
