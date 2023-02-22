package kr.ft.seoul.Observer_pattern.Observer;

import kr.ft.seoul.Observer_pattern.NumberGenerator.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
    // public abstract void display();
}