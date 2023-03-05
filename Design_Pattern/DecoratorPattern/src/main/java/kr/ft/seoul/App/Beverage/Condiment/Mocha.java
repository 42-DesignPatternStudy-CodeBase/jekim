package kr.ft.seoul.App.Beverage.Condiment;

import kr.ft.seoul.App.Beverage.Beverage;
import kr.ft.seoul.App.Beverage.Condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}