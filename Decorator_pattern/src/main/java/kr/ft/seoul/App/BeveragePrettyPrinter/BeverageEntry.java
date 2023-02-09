package kr.ft.seoul.App.BeveragePrettyPrinter;

import kr.ft.seoul.App.Beverage.Beverage;
import java.util.ArrayList;
import java.util.Collections;

public class BeverageEntry {
    private Beverage beverage;
    private String beverageName;
    private double beverageCost;
    private ArrayList<String> condimentList;

    public BeverageEntry(Beverage beverage) {
        this.beverage = beverage;
        String[] beverageElements = beverage.getDescription().split(" ");
        this.condimentList = new ArrayList<String>();
        for (int i = 0; i < beverageElements.length; i++) {
            if (i == beverageElements.length - 1) {
                this.beverageName = beverageElements[i];
            } else {
                this.condimentList.add(beverageElements[i]);
            }
        }
        Collections.sort(this.condimentList);
        this.beverageCost = beverage.cost();
    }

    public String getBeverageName() {
        return beverageName;
    }

    public double getBeverageCost() {
        return beverageCost;
    }

    public ArrayList<String> getCondimentList() {
        return condimentList;
    }

}
