package CaffeKiosk.BeverageTest;

import CaffeKiosk.Beverage.*;
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
}
