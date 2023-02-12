package CaffeKiosk.BeverageTest;

import CaffeKiosk.Beverage.*;
import kr.ft.seoul.App.StarBucksBeverage.Espresso;
import CaffeKiosk.TestClassBase;

import org.junit.Test;
import static org.junit.Assert.*;

public class BeverageTest extends TestClassBase {
    @Test
    public void BeverageSizeEnum_getExtraPriceBySize_Positive_00() {
        BeverageSizeEnum small = BeverageSizeEnum.SMALL;
        BeverageSizeEnum medium = BeverageSizeEnum.MEDIUM;
        BeverageSizeEnum large = BeverageSizeEnum.LARGE;

        assertEquals(0, small.getExtraPriceBySize(), 0);
        assertEquals(0.2, medium.getExtraPriceBySize(), 0);
        assertEquals(0.5, large.getExtraPriceBySize(), 0);
    }

    @Test
    public void Beverage_getName_Positive_00() {
        Beverage beverage = new Espresso();

        assertTrue(isDefinitlyEqualsString("Espresso", beverage.getName()));
        assertTrue(isDefinitlyEqualsString("Espresso", beverage.getDescription()));
        assertEquals(1.99, beverage.getPrice(), 0);
        assertEquals(BeverageSizeEnum.SMALL, beverage.getSize());
    }
}
