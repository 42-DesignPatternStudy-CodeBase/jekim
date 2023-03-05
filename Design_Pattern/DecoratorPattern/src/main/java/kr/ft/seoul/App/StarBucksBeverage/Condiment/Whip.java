package kr.ft.seoul.App.StarBucksBeverage.Condiment;

import kr.ft.seoul.App.StarBucksBeverage.Beverage;
import kr.ft.seoul.App.StarBucksBeverage.Condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return "Whip " + beverage.getDescription();
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.5;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.7;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.9;
        }
        return cost;
    }
}