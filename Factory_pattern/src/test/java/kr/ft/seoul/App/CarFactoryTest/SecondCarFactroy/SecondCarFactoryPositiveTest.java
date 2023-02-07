package kr.ft.seoul.oop_study.test.CarFactoryTest.SecondCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.SecondCarFactory.SecondCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class SecondCarFactoryPositiveTest extends CarFactoryTestBase {
    @Test
    public void SecondCarFactory_Creation_Positive_00() {
        SecondCarFactory carFactory = new SecondCarFactory();

        assertTrue(carFactory instanceof SecondCarFactory);
    }

    @Test
    public void SecondCarFactory_mabnufactor_Positive_Car() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Noname");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Noname"));
        assertTrue(tempCar instanceof Car);
    }

    @Test
    public void SecondCarFactory_mabnufactor_Positive_Sonata() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Sonata");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Sonata"));
        assertTrue(tempCar instanceof Sonata);
    }

    @Test
    public void SecondCarFactory_mabnufactor_Positive_Grandeur() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Grandeur");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Grandeur"));
        assertTrue(tempCar instanceof Grandeur);
    }

    @Test
    public void SecondCarFactory_mabnufactor_Positive_Genesis() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Genesis");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Genesis"));
        assertTrue(tempCar instanceof Genesis);
    }

    @Test
    public void SecondCarFactory_mabnufactor_Positive_Error() {
        SecondCarFactory carFactory = new SecondCarFactory();

        Car tempCar = carFactory.manufactor("Error");
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
