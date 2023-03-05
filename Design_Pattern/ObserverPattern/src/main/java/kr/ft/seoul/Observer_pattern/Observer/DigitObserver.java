package kr.ft.seoul.Observer_pattern.Observer;

import kr.ft.seoul.Observer_pattern.NumberGenerator.NumberGenerator;

public class DigitObserver implements Observer {
    private int observeredNumber = 0;
    
    public void update(NumberGenerator generator) {
        observeredNumber = generator.getNumber();
        this.display();
    }

    public void display() {
        System.out.println("DigitObserver: " + observeredNumber);
    }
}
