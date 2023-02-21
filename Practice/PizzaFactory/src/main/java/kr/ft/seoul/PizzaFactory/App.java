package kr.ft.seoul.PizzaFactory;

import java.util.Scanner;

import kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory.*;
import kr.ft.seoul.PizzaFactory.Pizza.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which pizza do you want to order? : ");
        String input = sc.nextLine();
        // Pizza ordered = orderPizza(input);

        // public void prepare() {
        //     final String stateMessage = "prepare ingrediants";
        //     System.out.println(String.format("[%s] %s...", this.type, stateMessage));
        // }

        // public void bake() {
        //     final String stateMessage = "The oven was heated up! going in!";
        //     System.out.println(String.format("[%s] %s...", this.type, stateMessage));
        // }

        // public void cut() {
        //     final String stateMessage = "Cutting the pizza into 42 pieces";
        //     System.out.println(String.format("[%s] %s...", this.type, stateMessage));
        // }

        // public void box() {
        //     final String stateMessage = "check it out! the box is here";
        //     System.out.println(String.format("[%s] %s...", this.type, stateMessage));
        // }
    }
}
