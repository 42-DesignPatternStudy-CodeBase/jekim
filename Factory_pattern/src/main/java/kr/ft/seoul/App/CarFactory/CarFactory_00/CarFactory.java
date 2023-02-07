package kr.ft.seoul.App.CarFactory.CarFactory_00;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.CarFactoryInterface;

public class CarFactory implements CarFactoryInterface {
    public Car manufactor(String productName) {
        return CarProduct.getCarProduct(productName);
    }
}