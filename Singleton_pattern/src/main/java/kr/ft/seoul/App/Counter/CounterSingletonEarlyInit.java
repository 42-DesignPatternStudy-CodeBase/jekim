package kr.ft.seoul.App.Counter;

public class CounterSingletonEarlyInit {
    private static CounterSingletonEarlyInit instance = new CounterSingletonEarlyInit();
    private int count = 0;

    private CounterSingletonEarlyInit() {
    }

    public static synchronized CounterSingletonEarlyInit getInstance() {
        instance.count++;
        return instance;
    }

    public int getCount() {
        return count;
    }
}

// JVM 클래스 로더는 최초 클래스 실행시 해당 클래스를 생성한다.
// 따라서 이 방식은 스레드 세이프 하다.

// 하지만 생성 시점에서 이 클래스는 메모리를 점유한다.