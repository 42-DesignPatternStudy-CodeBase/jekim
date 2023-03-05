package kr.ft.seoul.App.Counter;

public class CounterSingletonLazyHolder {
    private CounterSingletonLazyHolder() {
    }

    public static CounterSingletonLazyHolder getInstance() {
        LazyHolder.count++;
        return LazyHolder.INSTANCE;
    }

    // lazy - holder
    private static class LazyHolder {
        private static final CounterSingletonLazyHolder INSTANCE = new CounterSingletonLazyHolder();
        private static int count = 0;
    }

    public static int getCount() {
        return LazyHolder.count;
    }
}
