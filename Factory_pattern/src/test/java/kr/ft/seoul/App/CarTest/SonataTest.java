package kr.ft.seoul.oop_study.test.CarTest;

import kr.ft.seoul.App.Car.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SonataTest extends CarTestBase {
    @Test
    public void SonataTest_Creation_Positive_00() {
        Car tempCar = new Sonata();
        assertTrue(tempCar instanceof Sonata);
    }

    @Test
    public void SonataTest_Creation_Positive_01() {
        Car tempCar = new Sonata();
        Car perentCar = new Car("Noname");
        assertTrue(tempCar instanceof Car && perentCar.getClass() != tempCar.getClass());
    }

    @Test
    public void SonataTest_Creation_Negative_01() {
        Car tempCar = new Sonata();
        assertFalse(tempCar instanceof Grandeur);
    }

    @Test
    public void SonataTest_Creation_Negative_02() {
        Car tempCar = new Sonata();
        assertFalse(tempCar instanceof Genesis);
    }

    @Test
    public void SonataTest_toString_Positive_00() {
        Car tempCar = new Sonata();
        assertEquals("Sonata", tempCar.toString());
    }

    @Test
    public void SonataTest_toString_Negative_00() {
        Car tempCar = new Sonata();
        Car againstCar = new Car("Noname");
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void SonataTest_toString_Negative_01() {
        Car tempCar = new Sonata();
        Car againstCar = new Genesis();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void SonataTest_toString_Negative_02() {
        Car tempCar = new Sonata();
        Car againstCar = new Grandeur();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }
}
