package kr.ft.seoul.Observer_pattern.NumberGenerator;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    
    public int getNumber() {
        return number;
    }
    
    public void execute() {
        this.pickNumberRandomly();
        this.notifyObservers();
    }

    public void pickNumberRandomly() {
        this.number = random.nextInt(50);
    }
}