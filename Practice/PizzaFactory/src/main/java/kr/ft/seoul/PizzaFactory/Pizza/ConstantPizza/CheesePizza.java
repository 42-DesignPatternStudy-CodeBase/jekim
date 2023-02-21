package kr.ft.seoul.PizzaFactory.Pizza.ConstantPizza;

public class CheesePizza extends ConstantPizza implements Pizza {
    public CheesePizza() {
        super("CheesePizza", 12.99);
    }

    public double cost() {
        return super.cost();
    }

    public String getName() {
        return super.getName();
    }
}
