package kr.ft.seoul.App.StarBucksBeverage;

public abstract class Beverage {
    public enum Size {
        TALL, GRANDE, VENTI
    };
    Size size = Size.TALL;
    String description = "noname";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void getSize(Size size) {
        return size;
    }

    public abstract double cost();    
}