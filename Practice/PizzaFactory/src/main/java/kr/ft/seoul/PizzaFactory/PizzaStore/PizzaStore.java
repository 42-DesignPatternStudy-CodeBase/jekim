package kr.ft.seoul.PizzaFactory.PizzaStore;

import kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory.SimplePizzaFactory;
import kr.ft.seoul.PizzaFactory.Pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return this.factory.createPizza(type);
    }
}