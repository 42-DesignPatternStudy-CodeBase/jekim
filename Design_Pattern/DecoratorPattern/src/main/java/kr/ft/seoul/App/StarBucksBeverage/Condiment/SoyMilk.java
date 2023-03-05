package kr.ft.seoul.App.StarBucksBeverage.Condiment;

import kr.ft.seoul.App.StarBucksBeverage.Beverage;
import kr.ft.seoul.App.StarBucksBeverage.Condiment.CondimentDecorator;

public class SoyMilk extends CondimentDecorator {
    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return "Soymilk " + beverage.getDescription();
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        return cost;
    }
}