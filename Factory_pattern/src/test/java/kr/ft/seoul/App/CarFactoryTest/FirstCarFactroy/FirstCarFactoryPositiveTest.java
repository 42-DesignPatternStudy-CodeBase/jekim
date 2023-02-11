package kr.ft.seoul.oop_study.test.CarFactoryTest.FirstCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.FirstCarFactory.FirstCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class FirstCarFactoryPositiveTest extends CarFactoryTestBase {
    @Test
    public void FirstCarFactory_Creation_Positive_00() {
        FirstCarFactory carFactory = new FirstCarFactory();

        assertTrue(carFactory instanceof FirstCarFactory);
    }

    @Test
    public void FirstCarFactory_mabnufactor_Positive_Car() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Noname");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Noname"));
        assertTrue(tempCar instanceof Car);
    }

    @Test
    public void FirstCarFactory_mabnufactor_Positive_Sonata() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Sonata");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Sonata"));
        assertTrue(tempCar instanceof Sonata);
    }

    @Test
    public void FirstCarFactory_mabnufactor_Positive_Grandeur() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Grandeur");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Grandeur"));
        assertTrue(tempCar instanceof Grandeur);
    }

    @Test
    public void FirstCarFactory_mabnufactor_Positive_Genesis() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Genesis");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Genesis"));
        assertTrue(tempCar instanceof Genesis);
    }

    @Test
    public void FirstCarFactory_mabnufactor_Positive_Error() {
        FirstCarFactory carFactory = new FirstCarFactory();

        Car tempCar = carFactory.manufacture("Error");
        assertFalse(tempCar instanceof Sonata);
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), "Sonata"));
        assertFalse(tempCar instanceof Grandeur);
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), "Grandeur"));
        assertFalse(tempCar instanceof Genesis);
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), "Genesis"));

        assertTrue(tempCar instanceof Car);
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Noname"));
    }
}
