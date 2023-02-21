package kr.ft.seoul.PizzaFactory;

import java.util.Scanner;

import kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory.*;
import kr.ft.seoul.PizzaFactory.Pizza.*;

public class App 
{
    public static Pizza orderPizza(String type) {
        PizzaFactory pf = new SimplePizzaFactory();
        Pizza pizza = pf.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which pizza do you want to order? : ");
        String input = sc.nextLine();
        Pizza ordered = orderPizza(input);
    }
}
