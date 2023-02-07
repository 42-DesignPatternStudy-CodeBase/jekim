package kr.ft.seoul.App.Counter;

public class CounterSingletonDCL {
    private volatile static CounterSingletonDCL instance;
    private int count = 0;

    private CounterSingletonDCL() {}

    public static CounterSingletonDCL getInstance() {
        if (instance == null) {
            synchronized (CounterSingletonDCL.class) {
                if (instance == null) {
                    instance = new CounterSingletonDCL();
                }
            }
        }
        instance.count++;
        return instance;
    }

    public int getCount() {
        return this.count;
    }
}

// volatile의 특성을 활용한 싱글톤 패턴
// Lazy-Initialization + Syncronized 로 Syncronized에서 발생하는 비용을 꽤 감소시켰다.