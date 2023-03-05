package kr.ft.seoul.App.StarBucksBeverage;

import kr.ft.seoul.App.StarBucksBeverage.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}