package kr.ft.seoul.oop_study.test.CarFactoryTest.FirstCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.FirstCarFactory.FirstCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class FirstCarFactoryNegativeTest extends CarFactoryTestBase {
    @Test
    public void FirstCarFactory_Creation_Negative_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        assertFalse(carFactory == null);
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Car_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Noname");
        Car targetCar = carFactory.manufacture("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Car_01() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Noname");
        Car targetCar = carFactory.manufacture("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Car_02() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Noname");
        Car targetCar = carFactory.manufacture("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Sonata_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Sonata");
        Car targetCar = carFactory.manufacture("Grandeur");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Sonata_01() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Sonata");
        Car targetCar = carFactory.manufacture("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());        
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Sonata_02() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Sonata");
        Car targetCar = carFactory.manufacture("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void FirstCarFactory_manufacture_Negative_Grandeur_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Grandeur");
        Car targetCar = carFactory.manufacture("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Grandeur_01() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Grandeur");
        Car targetCar = carFactory.manufacture("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Grandeur_02() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Grandeur");
        Car targetCar = carFactory.manufacture("Genesis");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }



    @Test
    public void FirstCarFactory_manufacture_Negative_Genesis_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Genesis");
        Car targetCar = carFactory.manufacture("Noname");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }

    @Test
    public void FirstCarFactory_manufacture_Negative_Genesis_01() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Genesis");
        Car targetCar = carFactory.manufacture("Granduer");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
 
    @Test
    public void FirstCarFactory_manufacture_Negative_Genesis_02() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Genesis");
        Car targetCar = carFactory.manufacture("Sonata");
        assertFalse(targetCar.getClass() == tempCar.getClass());
    }
}



