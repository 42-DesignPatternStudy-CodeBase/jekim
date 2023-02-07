package kr.ft.seoul.App.StarBucksBeverage.Condiment;

import kr.ft.seoul.App.StarBucksBeverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
    public abstract double cost();
}