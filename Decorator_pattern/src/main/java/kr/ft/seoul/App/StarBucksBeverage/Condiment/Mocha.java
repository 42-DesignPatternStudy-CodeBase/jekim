package kr.ft.seoul.App.StarBucksBeverage.Condiment;

import kr.ft.seoul.App.StarBucksBeverage.Beverage;
import kr.ft.seoul.App.StarBucksBeverage.Condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.25;
        }
        return cost;
    }
}