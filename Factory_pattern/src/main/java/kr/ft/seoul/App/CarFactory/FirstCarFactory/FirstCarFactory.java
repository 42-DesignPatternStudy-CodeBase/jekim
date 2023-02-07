package kr.ft.seoul.App.CarFactory.FirstCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.CarFactoryInterface;

public class FirstCarFactory implements CarFactoryInterface {
    public Car manufactor(String productName) {
        return CarProduct.getCarProduct(productName);
    }
}