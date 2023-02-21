package kr.ft.seoul.PizzaFactory.Pizza.ConstantPizza;

import java.util.ArrayList;
import java.util.Arrays;

import kr.ft.seoul.PizzaFactory.Pizza.Ingredients.Ingredient;

public abstract class ConstantPizza {
    private BasePizzaInfo basePizzaInfo;
    private ArrayList<Ingredient> ingredients;
    
    public ConstantPizza(String type, double cost) {
        this.basePizzaInfo = new BasePizzaInfo(type, cost);
    }

    public void addIngredient(Ingredient ... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));   
    }

    public double cost() {
        double ingredientsCost = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            ingredientsCost += ingredient.cost();
        }
        return basePizzaInfo.cost() + ingredientsCost;
    }

    public String getName() {
        return this.basePizzaInfo.getType();
    }
}
