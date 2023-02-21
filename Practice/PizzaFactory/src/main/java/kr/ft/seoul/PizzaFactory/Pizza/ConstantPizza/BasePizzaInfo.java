package kr.ft.seoul.PizzaFactory.Pizza.ConstantPizza;

public class BasePizzaInfo {
    private String type;
    private double cost;

    public BasePizzaInfo(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public double cost() {
        return this.cost;
    }

    public String getType() {
        return this.type;
    }
}

// public void prepare();
// public void bake();
// public void cut();
// public void box();