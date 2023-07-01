package designpattern.templatecallback;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총.. 초총.. 총!");
            }
        });

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼..카칼..칼!");
            }
        });

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼..도도끼!!");
            }
        });
    }
}
