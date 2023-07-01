# design-pattern-study
> 📖 '스프링 입문을 위한 자바 객체 지향의 원리와 이해' 의 '스프링이 사랑한 디자인 패턴'을 공부하고 정리한 레포입니다.

## 디자인 패턴이란?
- 요리로 비유하자면, **표준화된 요리법**
- 많은 개발자들이 고민하고 정제한 사실 상의 **표준 설계 패턴**
- 실제 개발 현장에서 비즈니스 요구 사항을 프로그래밍으로 처리하며 만들어진 **다양한 해결책 중 많이들 인정한 best practice를 정리한 것**
- **객체 지향 특성**과 **설계 원칙을 기반**으로 구현됨
- **스프링**에서의 디자인 패턴들  → 자바 엔터프라이즈 개발을 편하게 해주는 오픈소스 경량급 애플리케이션 프레임워크 (스프링 프레임워크 = **OOP 프레임워크)**
    - 스프링에서 시작해 객체 지향으로 향하는 하향식(Top-Down),
    - 객체 지향에서 시작해 스프링으로 향하는 상향식(Bottom-up)
- 디자인 패턴은 객체 지향 특성 중 `상속(extends)`, `인터페이스(interface/implements)`, `합성(객체를 속성으로 사용)`을 이용한다.

<br>

### 어댑터 패턴
```java
public class ServiceA {
    void runServiceA() {
    }
}

public class ServiceB {
    void runServiceB() {
    }
}
```

```java
public class AdapterServiceA {
    ServiceA s1 = new ServiceA();

    void runService() {
        s1.runServiceA();
    }
}

public class AdapterServiceB {
    ServiceB sB = new ServiceB();

    void runService() {
        sB.runServiceB();
    }
}

```

```java
// 어댑터 패턴 적용 전
public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA sA = new ServiceA();
        ServiceB sB = new ServiceB();

        sA.runServiceA();
        sB.runServiceB();
    }
}

// 어댑터 패턴 적용 후
public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }
}
```
