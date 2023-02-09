package kr.ft.seoul.App.Beverage.Condiment;

import kr.ft.seoul.App.Beverage.Beverage;
import kr.ft.seoul.App.Beverage.Condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return "Whip " + beverage.getDescription();
    }

    public double cost() {
        return beverage.cost() + 0.05;
    }
}