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
            FirstCarFactory carFactory = new FirstCarFactory();

            Car mycar1 = carFactory.manufactor("Sonata");
            Car mycar2 = carFactory.manufactor("Genesis");
            Car mycar3 = carFactory.manufactor("Grandeur");
            Car mycar4 = carFactory.manufactor("what?");


            System.out.println("Car category : " + mycar1.toString());
            System.out.println("Car category : " + mycar2.toString());
            System.out.println("Car category : " + mycar3.toString());
            System.out.println("Car category : " + mycar4.toString());
        }

        {
            SecondCarFactory carFactory = new SecondCarFactory();

            Car mycar1 = carFactory.manufactor("Sonata");
            Car mycar2 = carFactory.manufactor("Genesis");
            Car mycar3 = carFactory.manufactor("Grandeur");
            Car mycar4 = carFactory.manufactor("what?");


            System.out.println("Car category : " + mycar1.toString());
            System.out.println("Car category : " + mycar2.toString());
            System.out.println("Car category : " + mycar3.toString());
            System.out.println("Car category : " + mycar4.toString());
        }

        {
            ThirdCarFactory carFactory = new ThirdCarFactory();

            Car mycar1 = carFactory.manufactor("Sonata");
            Car mycar2 = carFactory.manufactor("Genesis");
            Car mycar3 = carFactory.manufactor("Grandeur");
            Car mycar4 = carFactory.manufactor("what?");


            System.out.println("Car category : " + mycar1.toString());
            System.out.println("Car category : " + mycar2.toString());
            System.out.println("Car category : " + mycar3.toString());
            System.out.println("Car category : " + mycar4.toString());
        }
    }
}
