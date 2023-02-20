package kr.ft.seoul.PizzaFactory.Pizza;

public class GreekPizza implements Pizza {
    private final String type = "GreekPizza";

    public void prepare() {
        final String stateMessage = "prepare ingrediants";
        System.out.println(String.format("[%s] %s...", this.type, stateMessage));
    }

    public void bake() {
        final String stateMessage = "The oven was heated up! going in!";
        System.out.println(String.format("[%s] %s...", this.type, stateMessage));
    }

    public void cut() {
        final String stateMessage = "Cutting the pizza into 42 pieces";
        System.out.println(String.format("[%s] %s...", this.type, stateMessage));
    }

    public void box() {
        final String stateMessage = "check it out! the box is here";
        System.out.println(String.format("[%s] %s...", this.type, stateMessage));
    }
}