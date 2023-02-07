package kr.ft.seoul.App.Car;

public class Car implements CarInterface {
    protected String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return this.productName;
    }
}