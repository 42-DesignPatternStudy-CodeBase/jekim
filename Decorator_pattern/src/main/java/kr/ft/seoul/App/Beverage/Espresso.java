package kr.ft.seoul.App.Beverage;

import kr.ft.seoul.App.Beverage.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}