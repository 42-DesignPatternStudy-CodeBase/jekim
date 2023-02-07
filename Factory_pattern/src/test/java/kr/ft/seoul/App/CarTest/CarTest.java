package kr.ft.seoul.oop_study.test.CarTest;

import kr.ft.seoul.App.Car.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest extends CarTestBase {
    @Test
    public void CarTest_Creation_Positive_00() {
        Car tempCar = new Car("Noname");
        assertTrue(tempCar instanceof Car);
    }

    @Test
    public void CarTest_Creation_Negative_00() {
        Car tempCar = new Car("Mycar");
        assertFalse(tempCar instanceof Sonata);
    }

    @Test
    public void CarTest_Creation_Negative_01() {
        Car tempCar = new Car("Mycar");
        assertFalse(tempCar instanceof Grandeur);
    }

    @Test
    public void CarTest_Creation_Negative_02() {
        Car tempCar = new Car("Mycar");
        assertFalse(tempCar instanceof Genesis);
    }

    @Test
    public void CarTest_toString_Positive_00() {
        Car tempCar = new Car("Noname");
        assertTrue(isDefinitlyEqualsString("Noname", tempCar.toString()));
    }

    @Test
    public void CarTest_toString_Negative_00() {
        Car tempCar = new Car("Noname");
        assertFalse(isDefinitlyEqualsString("Mycar", tempCar.toString()));
    }

    @Test
    public void CarTest_toString_Negative_01() {
        Car tempCar = new Car("Noname");
        assertFalse(isDefinitlyEqualsString("noname", tempCar.toString()));
    }
}
