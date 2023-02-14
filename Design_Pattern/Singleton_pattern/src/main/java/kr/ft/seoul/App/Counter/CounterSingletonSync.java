package kr.ft.seoul.App.Counter;

public class CounterSingletonSync {
    private static CounterSingletonSync instance = null;
    private int count = 0;

    private CounterSingletonSync() {
    }

    // synchronized 키워드를 사용해서 Lazy-initialization의 단점을 극복할 수 있다.
    // 뮤텍스 락과 비슷한 방식이라고 생각하면 쉬움.
    // 이를 통해 스레드 세이프한 싱글톤을 설계할 수 있다.
    public static synchronized CounterSingletonSync getInstance() {
        if (instance == null) {
            instance = new CounterSingletonSync();
        }
        instance.count++;
        return instance;
    }

    public int getCount() {
        return count;
    }
}

// 하지만 100개의 스레드에서 이를 생성하고 사용한다면 어떨까?
// 그 때도 프로그램은 효율적일까?