package kr.ft.seoul.App;

import kr.ft.seoul.App.Beverage.*;
import kr.ft.seoul.App.Beverage.Condiment.*;
import kr.ft.seoul.App.Calculator.DoublePrecisionCompensator;
import kr.ft.seoul.App.BeveragePrettyPrinter.*;

public class App
{   
    public static void main( String[] args )
    {
        BeveragePrettyPrinter beveragePrettyPrinter = new BeveragePrettyPrinter();
        
        Beverage beverage1 = new Espresso();
        beverage1 = new SoyMilk(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Whip(beverage1);

        beveragePrettyPrinter.printBeverage(beverage1);
        

        Beverage beverage2 = new HouseBlend();
        beverage2 = new SoyMilk(beverage2);
        beverage2 = new SoyMilk(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);

        beveragePrettyPrinter.printBeverage(beverage2);
    }
}
