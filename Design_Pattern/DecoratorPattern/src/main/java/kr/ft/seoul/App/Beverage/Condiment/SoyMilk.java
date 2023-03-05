package kr.ft.seoul.App.Beverage.Condiment;

import kr.ft.seoul.App.Beverage.Beverage;
import kr.ft.seoul.App.Beverage.Condiment.CondimentDecorator;

public class SoyMilk extends CondimentDecorator {
    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return "Soymilk " + beverage.getDescription();
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}