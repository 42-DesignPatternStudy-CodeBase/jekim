package kr.ft.seoul.oop_study.test.CarFactoryTest.ThirdCarFactory;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.ThirdCarFactory.ThirdCarFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.oop_study.test.CarFactoryTest.CarFactoryTestBase;

public class ThirdCarFactoryPositiveTest extends CarFactoryTestBase {
    @Test
    public void ThirdCarFactory_Creation_Positive_00() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        assertTrue(carFactory instanceof ThirdCarFactory);
    }

    @Test
    public void ThirdCarFactory_mabnufactor_Positive_Car() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufacture("Noname");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Noname"));
        assertTrue(tempCar instanceof Car);
    }

    @Test
    public void ThirdCarFactory_mabnufactor_Positive_Sonata() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufacture("Sonata");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Sonata"));
        assertTrue(tempCar instanceof Sonata);
    }

    @Test
    public void ThirdCarFactory_mabnufactor_Positive_Grandeur() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufacture("Grandeur");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Grandeur"));
        assertTrue(tempCar instanceof Grandeur);
    }

    @Test
    public void ThirdCarFactory_mabnufactor_Positive_Genesis() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

        Car tempCar = carFactory.manufacture("Genesis");
        assertTrue(isDefinitlyEqualsString(tempCar.toString(), "Genesis"));
        assertTrue(tempCar instanceof Genesis);
    }

    @Test
    public void ThirdCarFactory_mabnufactor_Positive_Error() {
        ThirdCarFactory carFactory = new ThirdCarFactory();

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
