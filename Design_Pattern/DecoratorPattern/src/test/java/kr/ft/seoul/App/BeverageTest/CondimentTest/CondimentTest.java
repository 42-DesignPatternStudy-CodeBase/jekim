package kr.ft.seoul.App.test.BeverageTest.CondimentTest;

import kr.ft.seoul.App.Beverage.Condiment.*;
import kr.ft.seoul.App.Beverage.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CondimentTest extends CondimentTestBase {
    @Test
    public void MochaTest_Creation_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertTrue(tempMocha instanceof Mocha);
    }

    @Test
    public void MochaTest_Creation_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(tempMocha instanceof SoyMilk);
    }

    @Test
    public void MochaTest_Creation_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(tempMocha instanceof Whip);
    }

    @Test
    public void MochaTest_toString_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertTrue(isDefinitlyEqualsString("Mocha Espresso", tempMocha.getDescription()));
    }

    @Test
    public void MochaTest_toString_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("SoyMilk Espresso", tempMocha.getDescription()));
    }

    @Test
    public void MochaTest_toString_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("Whip Espresso", tempMocha.getDescription()));
    }

    @Test
    public void MochaTest_cost_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertTrue(isDefinitlyEqualsDouble(2.19, tempMocha.cost()));
    }

    @Test
    public void MochaTest_cost_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.18, tempMocha.cost()));
    }

    @Test
    public void MochaTest_cost_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempMocha = new Mocha(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.20, tempMocha.cost()));
    }

    @Test
    public void SoyMilkTest_Creation_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertTrue(tempSoyMilk instanceof SoyMilk);
    }

    @Test
    public void SoyMilkTest_Creation_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(tempSoyMilk instanceof Mocha);
    }

    @Test
    public void SoyMilkTest_Creation_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(tempSoyMilk instanceof Whip);
    }

    @Test
    public void SoyMilkTest_toString_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertTrue(isDefinitlyEqualsString("Soymilk Espresso", tempSoyMilk.getDescription()));
    }

    @Test
    public void SoyMilkTest_toString_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("Mocha Espresso", tempSoyMilk.getDescription()));
    }

    @Test
    public void SoyMilkTest_toString_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("Whip Espresso", tempSoyMilk.getDescription()));
    }

    @Test
    public void SoyMilkTest_cost_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertTrue(isDefinitlyEqualsDouble(2.14, tempSoyMilk.cost()));
    }

    @Test
    public void SoyMilkTest_cost_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.13, tempSoyMilk.cost()));
    }

    @Test
    public void SoyMilkTest_cost_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempSoyMilk = new SoyMilk(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.15, tempSoyMilk.cost()));
    }

    @Test
    public void WhipTest_Creation_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertTrue(tempWhip instanceof Whip);
    }

    @Test
    public void WhipTest_Creation_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(tempWhip instanceof Mocha);
    }

    @Test
    public void WhipTest_Creation_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(tempWhip instanceof SoyMilk);
    }

    @Test
    public void WhipTest_toString_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertTrue(isDefinitlyEqualsString("Whip Espresso", tempWhip.getDescription()));
    }

    @Test
    public void WhipTest_toString_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("Mocha Espresso", tempWhip.getDescription()));
    }

    @Test
    public void WhipTest_toString_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(isDefinitlyEqualsString("Soymilk Espresso", tempWhip.getDescription()));
    }

    @Test
    public void WhipTest_cost_Positive_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
        System.out.println(tempWhip.cost());
    
        assertTrue(isDefinitlyEqualsDouble(2.04, tempWhip.cost()));
    }

    @Test
    public void WhipTest_cost_Negative_00() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.03, tempWhip.cost()));
    }

    @Test
    public void WhipTest_cost_Negative_01() {
        Beverage tempEspresso = new Espresso();
        Beverage tempWhip = new Whip(tempEspresso);
    
        assertFalse(isDefinitlyEqualsDouble(2.05, tempWhip.cost()));
    }
}
