package kr.ft.seoul.oop_study.test.CarTest;

import kr.ft.seoul.App.Car.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GenesisTest extends CarTestBase {
    @Test
    public void GenesisTest_Creation_Positive_00() {
        Car tempCar = new Genesis();
        assertTrue(tempCar instanceof Genesis);
    }

    @Test
    public void GenesisTest_Creation_Positive_01() {
        Car tempCar = new Grandeur();
        Car perentCar = new Car("Noname");
        assertTrue(tempCar instanceof Car && perentCar.getClass() != tempCar.getClass());
    }

    @Test
    public void GenesisTest_Creation_Negative_00() {
        Car tempCar = new Genesis();
        assertFalse(tempCar instanceof Sonata);
    }

    @Test
    public void GenesisTest_Creation_Negative_01() {
        Car tempCar = new Genesis();
        assertFalse(tempCar instanceof Grandeur);
    }

    @Test
    public void GenesisTest_toString_Positive_00() {
        Car tempCar = new Genesis();
        assertEquals("Genesis", tempCar.toString());
    }

    @Test
    public void GenesisTest_toString_Negative_00() {
        Car tempCar = new Genesis();
        Car againstCar = new Car("Noname");
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void GenesisTest_toString_Negative_01() {
        Car tempCar = new Genesis();
        Car againstCar = new Grandeur();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }

    @Test
    public void GenesisTest_toString_Negative_02() {
        Car tempCar = new Genesis();
        Car againstCar = new Sonata();
        assertFalse(isDefinitlyEqualsString(tempCar.toString(), againstCar.toString()));
    }
}
