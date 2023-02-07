package kr.ft.seoul.App;

import kr.ft.seoul.App.Beverage.*;
import kr.ft.seoul.App.Beverage.Condiment.*;
import kr.ft.seoul.App.Calculator.DoublePrecisionCompensator;

public class App
{
    public static void printPrice(Beverage beverage) {
        DoublePrecisionCompensator doublePrecisionCompensator = new DoublePrecisionCompensator();
        System.out.println(beverage.getDescription() + " : $" + doublePrecisionCompensator.correctPrecisionError(beverage.cost(), 3));
    }
    
    public static void main( String[] args )
    {
        Beverage beverage1 = new Espresso();

        printPrice(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);

        printPrice(beverage2);

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        beverage3 = new SoyMilk(beverage3);

        printPrice(beverage3);
    }
}
