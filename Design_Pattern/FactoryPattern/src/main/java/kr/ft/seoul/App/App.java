package kr.ft.seoul.App;

import kr.ft.seoul.App.Car.*;
import kr.ft.seoul.App.CarFactory.FirstCarFactory.*;
import kr.ft.seoul.App.CarFactory.SecondCarFactory.*;
import kr.ft.seoul.App.CarFactory.ThirdCarFactory.*;

public class App 
{
    public static void main( String[] args )
    {
        {
            System.out.println("The FirstCarFactory will start the manufacturing");
            FirstCarFactory carFactory = new FirstCarFactory();

            Car mycar1 = carFactory.manufacture("Sonata");
            Car mycar2 = carFactory.manufacture("Genesis");
            Car mycar3 = carFactory.manufacture("Grandeur");
            Car mycar4 = carFactory.manufacture("what?");


            System.out.println("Car1 category : " + mycar1.toString());
            System.out.println("Car2 category : " + mycar2.toString());
            System.out.println("Car3 category : " + mycar3.toString());
            System.out.println("Car4 category : " + mycar4.toString());
        }

        {
            System.out.println("The SecondCarFactory will start the manufacturing");
            SecondCarFactory carFactory = new SecondCarFactory();

            Car mycar1 = carFactory.manufacture("Sonata");
            Car mycar2 = carFactory.manufacture("Genesis");
            Car mycar3 = carFactory.manufacture("Grandeur");
            Car mycar4 = carFactory.manufacture("what?");


            System.out.println("Car1 category : " + mycar1.toString());
            System.out.println("Car2 category : " + mycar2.toString());
            System.out.println("Car3 category : " + mycar3.toString());
            System.out.println("Car4 category : " + mycar4.toString());
        }

        {
            System.out.println("The ThirdCarFactory will start the manufacturing");
            ThirdCarFactory carFactory = new ThirdCarFactory();

            Car mycar1 = carFactory.manufacture("Sonata");
            Car mycar2 = carFactory.manufacture("Genesis");
            Car mycar3 = carFactory.manufacture("Grandeur");
            Car mycar4 = carFactory.manufacture("what?");


            System.out.println("Car1 category : " + mycar1.toString());
            System.out.println("Car2 category : " + mycar2.toString());
            System.out.println("Car3 category : " + mycar3.toString());
            System.out.println("Car4 category : " + mycar4.toString());
        }
    }
}
