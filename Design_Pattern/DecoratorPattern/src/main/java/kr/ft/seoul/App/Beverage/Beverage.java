package kr.ft.seoul.App.Beverage;

public abstract class Beverage {
    String description = "noname";

    public String getDescription() {
        return description;
    }

    public abstract double cost();    
}