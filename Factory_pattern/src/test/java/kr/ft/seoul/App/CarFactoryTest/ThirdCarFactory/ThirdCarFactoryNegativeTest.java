package kr.ft.seoul.oop_study.test.CarFactoryTest.ThirdCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.ThirdCarFactory.ThirdCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class ThirdCarFactoryNegativeTest extends CarFactoryTestBase {
    @Test
    public void ThirdCarFactory_Creation_Negative_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        assertFalse(carFactory == null);
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Car_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Car_01() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Car_02() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Sonata_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Sonata_01() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());        
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Sonata_02() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void ThirdCarFactory_manufactor_Negative_Grandeur_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Grandeur_01() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Grandeur_02() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        Car targetCar = carFactory.manufactor("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void ThirdCarFactory_manufactor_Negative_Genesis_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void ThirdCarFactory_manufactor_Negative_Genesis_01() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Granduer");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
 
    @Test
    public void ThirdCarFactory_manufactor_Negative_Genesis_02() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        Car targetCar = carFactory.manufactor("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
}
