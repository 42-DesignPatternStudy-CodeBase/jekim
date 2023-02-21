package kr.ft.seoul.PizzaFactory.PizzaStore;

import kr.ft.seoul.PizzaFactory.PizzaStore.PizzaFactory.SimplePizzaFactory;
import kr.ft.seoul.PizzaFactory.Pizza.Pizza;

public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    abstract Pizza createPizza(String type);
}