package kr.ft.seoul.App.CarFactory.ThirdCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.CarFactoryInterface;

public class ThirdCarFactory implements CarFactoryInterface {
    public Car manufactor(String productName) {
        Car car = null;

        if( productName.equalsIgnoreCase("Sonata")) {
            car = new Sonata();
        } else if( productName.equalsIgnoreCase("Grandeur")) {
            car = new Grandeur();
        } else if( productName.equalsIgnoreCase("Genesis")) {
            car = new Genesis();
        } else {
            car = new Car("Noname");
        }
        return car;
    }
}