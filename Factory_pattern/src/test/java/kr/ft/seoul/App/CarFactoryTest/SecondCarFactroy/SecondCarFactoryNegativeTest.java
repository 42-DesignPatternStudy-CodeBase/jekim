package kr.ft.seoul.oop_study.test.CarFactoryTest.SecondCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.SecondCarFactory.SecondCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class SecondCarFactoryNegativeTest extends CarFactoryTestBase {
    @Test
    public void SecondCarFactory_Creation_Negative_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        assertFalse(carFactory == null);
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Car_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Car_01() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Car_02() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Sonata_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Sonata_01() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());        
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Sonata_02() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void SecondCarFactory_manufactor_Negative_Grandeur_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Grandeur_01() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Grandeur_02() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void SecondCarFactory_manufactor_Negative_Genesis_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void SecondCarFactory_manufactor_Negative_Genesis_01() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Granduer");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
 
    @Test
    public void SecondCarFactory_manufactor_Negative_Genesis_02() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
}
