package kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory;

import kr.ft.seoul.PizzaFactory.Pizza.*;

public class SimplePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            pizza = null;
        }

        return pizza;
    }
}