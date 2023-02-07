package kr.ft.seoul.oop_study.test.CarTest;

import kr.ft.seoul.App.Car.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GrandeurTest extends CarTestBase {
    @Test
    public void GranduerTest_Creation_Positive_00() {
        Car tempCar = new Grandeur();
        assertTrue(tempCar instanceof Grandeur);
    }

    @Test
    public void GranduerTest_Creation_Positive_01() {
        Car tempCar = new Grandeur();
        Car perentCar = new Car("Noname");
        assertTrue(tempCar instanceof Car && perentCar.getClass() != tempCar.getClass());
    }

    @Test
    public void GranduerTest_Creation_Negative_01() {
        Car tempCar = new Grandeur();
        assertFalse(tempCar instanceof Sonata);
    }

    @Test
    public void GranduerTest_Creation_Negative_02() {
        Car tempCar = new Grandeur();
        assertFalse(tempCar instanceof Genesis);
    }

    @Test
    public void GranduerTest_toString_Positive_00() {
        Car tempCar = new Grandeur();
        assertEquals("Grandeur", tempCar.toString());
    }

    @Test
    public void GranduerTest_toString_Negative_00() {
        Car tempCar = new Grandeur();
        Car againstCar = new Car("Noname");
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void GranduerTest_toString_Negative_01() {
        Car tempCar = new Grandeur();
        Car againstCar = new Genesis();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void GranduerTest_toString_Negative_02() {
        Car tempCar = new Grandeur();
        Car againstCar = new Sonata();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }
}





