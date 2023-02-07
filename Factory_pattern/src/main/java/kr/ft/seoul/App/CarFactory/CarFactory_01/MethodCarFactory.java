package kr.ft.seoul.App.CarFactory.CarFactory_01;

import kr.ft.seoul.App.Car.Car;
import kr.ft.seoul.App.CarFactory.CarFactoryInterface;


public class MethodCarFactory implements CarFactoryInterface {
    public Car manufactor(String productName) {
        if (productName.compareTo("Sonata") == 0)
            return CarFactoryMethod.SONATA.create();
        if (productName.compareTo("Grandeur") == 0)
            return CarFactoryMethod.GRANDEUR.create();
        if (productName.compareTo("Genesis") == 0)
            return CarFactoryMethod.GENESIS.create();
        return CarFactoryMethod.DEFAULT.create();
    }
}