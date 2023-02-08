package kr.ft.seoul.App.test.BeverageTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import kr.ft.seoul.App.Beverage.*;

public class BeverageTest extends BeverageTestBase {
    @Test
    public void EspressoTest_Creation_Positive_00() {
        Beverage tempEspresso = new Espresso();
        assertTrue(tempEspresso instanceof Espresso);
    }

    @Test
    public void EspressoTest_Creation_Negative_00() {
        Beverage tempEspresso = new Espresso();
        assertFalse(tempEspresso instanceof HouseBlend);
    }

    @Test
    public void EspressoTest_Creation_Negative_01() {
        Beverage tempEspresso = new Espresso();
        assertFalse(tempEspresso instanceof DarkRoast);
    }

    @Test
    public void EspressoTest_toString_Positive_00() {
        Beverage tempEspresso = new Espresso();
        assertTrue(isDefinitlyEqualsString("Espresso", tempEspresso.getDescription()));
    }

    @Test
    public void EspressoTest_toString_Negative_00() {
        Beverage tempEspresso = new Espresso();
        assertFalse(isDefinitlyEqualsString("HouseBlend", tempEspresso.getDescription()));
    }

    @Test
    public void EspressoTest_toString_Negative_01() {
        Beverage tempEspresso = new Espresso();
        assertFalse(isDefinitlyEqualsString("DarkRoast", tempEspresso.getDescription()));
    }

    @Test
    public void HouseBlendTest_Creation_Positive_00() {
        Beverage tempHouseBlend = new HouseBlend();
        assertTrue(tempHouseBlend instanceof HouseBlend);
    }

    @Test
    public void HouseBlendTest_Creation_Negative_00() {
        Beverage tempHouseBlend = new HouseBlend();
        assertFalse(tempHouseBlend instanceof Espresso);
    }

    @Test
    public void HouseBlendTest_Creation_Negative_01() {
        Beverage tempHouseBlend = new HouseBlend();
        assertFalse(tempHouseBlend instanceof DarkRoast);
    }

    @Test
    public void HouseBlendTest_toString_Positive_00() {
        Beverage tempHouseBlend = new HouseBlend();
        assertTrue(isDefinitlyEqualsString("HouseBlend", tempHouseBlend.getDescription()));
    }

    @Test
    public void HouseBlendTest_toString_Negative_00() {
        Beverage tempHouseBlend = new HouseBlend();
        assertFalse(isDefinitlyEqualsString("Espresso", tempHouseBlend.getDescription()));
    }

    @Test
    public void HouseBlendTest_toString_Negative_01() {
        Beverage tempHouseBlend = new HouseBlend();
        assertFalse(isDefinitlyEqualsString("DarkRoast", tempHouseBlend.getDescription()));
    }

    @Test
    public void DarkRoastTest_Creation_Positive_00() {
        Beverage tempDarkRoast = new DarkRoast();
        assertTrue(tempDarkRoast instanceof DarkRoast);
    }

    @Test
    public void DarkRoastTest_Creation_Negative_00() {
        Beverage tempDarkRoast = new DarkRoast();
        assertFalse(tempDarkRoast instanceof Espresso);
    }

    @Test
    public void DarkRoastTest_Creation_Negative_01() {
        Beverage tempDarkRoast = new DarkRoast();
        assertFalse(tempDarkRoast instanceof HouseBlend);
    }

    @Test
    public void DarkRoastTest_toString_Positive_00() {
        Beverage tempDarkRoast = new DarkRoast();
        assertTrue(isDefinitlyEqualsString("DarkRoast", tempDarkRoast.getDescription()));
    }

    @Test
    public void DarkRoastTest_toString_Negative_00() {
        Beverage tempDarkRoast = new DarkRoast();
        assertFalse(isDefinitlyEqualsString("Espresso", tempDarkRoast.getDescription()));
    }

    @Test
    public void DarkRoastTest_toString_Negative_01() {
        Beverage tempDarkRoast = new DarkRoast();
        assertFalse(isDefinitlyEqualsString("HouseBlend", tempDarkRoast.getDescription()));
    }
}
