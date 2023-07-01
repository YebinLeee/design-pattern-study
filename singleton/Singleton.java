package designpattern.singleton;

public class Singleton {
    static Singleton singletonInstance; // 정적 참조 변수

    // private 생성자
    private Singleton() {
    }


    // 객체 반환 정적 메서드
    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
