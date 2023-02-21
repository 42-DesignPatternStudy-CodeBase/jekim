package kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory;

import kr.ft.seoul.PizzaFactory.Pizza.Pizza;

public interface PizzaFactory {
    public Pizza createPizza(String type);
}