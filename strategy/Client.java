package designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달하여 전투를 수행 (컨텍스트에게 전략 객체를 생성하여 주입)
        strategy = new StrategyGun();
        rambo.runContext(strategy);
    }
}
