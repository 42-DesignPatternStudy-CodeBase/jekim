package kr.ft.seoul.App.CarFactory.SecondCarFactory;

import kr.ft.seoul.App.Car.Car;
import kr.ft.seoul.App.CarFactory.CarFactoryInterface;


public class SecondCarFactory implements CarFactoryInterface {
    public Car manufacture(String productName) {
        if (productName.compareTo("Sonata") == 0)
            return CarFactoryMethod.SONATA.create();
        if (productName.compareTo("Grandeur") == 0)
            return CarFactoryMethod.GRANDEUR.create();
        if (productName.compareTo("Genesis") == 0)
            return CarFactoryMethod.GENESIS.create();
        return CarFactoryMethod.DEFAULT.create();
    }
}