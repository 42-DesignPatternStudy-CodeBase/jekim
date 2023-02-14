package kr.ft.seoul.App.Counter;

public class CounterSingleton {
    private static CounterSingleton instance = null;
    private int count = 0;

    private CounterSingleton() {
    }

    // 이 방식은 Lazy-Initialization이다.
    // 이 방식은 null 체크시에 스레드 세이프하지 않아서 멀티스레드 환경에서는 추천하지 않는다.
    // 또한 동일 시점에 getInstance가 두 번 실행되면 초기화도 두 번 되는 단점도 있다.
    public static CounterSingleton getInstance() {
        if (instance == null) {
            instance = new CounterSingleton();
        }
        instance.count++;
        return instance;
    }

    public int getCount() {
        return count;
    }
}

// 싱글톤의 기본 매커니즘
// 기본 생성자를 private 하게 선언한다.
// 필드에 instance를 선언하고 이를 접근하는 하나의 public static 메소드를 만든다.
//      ! : 안전한 싱글톤 패턴은 이 시점에서 스레드 세이프하게 접근 메소드를 확보한다.
// 접근 메소드 내부에서 instance이 null인 경우와 아닌 경우를 분기처리 한다.
// 분기처리 시점에서 instance가 null이라면 초기화를 실행해준다.
// 접근 메소드는 instance를 리턴한다.

// 접근 메소드에서 어떻게 null 체크를 하고
// 접근 및 인스턴스 생성 시점에서 스레드 세이프를 확보하는 방법에서
// 많은 기법들이 생겨날 수 있다.