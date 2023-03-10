package kr.ft.seoul.App.Beverage.Condiment;

import kr.ft.seoul.App.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    double cost;
    public abstract String getDescription();
    public abstract double cost();
}