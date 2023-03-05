package kr.ft.seoul.App.BeveragePrettyPrinter;

import java.util.HashMap;
import java.util.ArrayList;

import kr.ft.seoul.App.BeveragePrettyPrinter.BeverageEntry;
import kr.ft.seoul.App.Beverage.Beverage;
import kr.ft.seoul.App.Calculator.DoublePrecisionCompensator;

public class BeveragePrettyPrinter {
    public void printBeverage(Beverage Beverage) {
        BeverageEntry BeverageEntry = new BeverageEntry(Beverage);
        System.out.println(buildBeverageData(BeverageEntry) + " : $" + printPriceDallor(Beverage, 4));
    }

    private String buildBeverageData(BeverageEntry BeverageEntry) {
        String beverageName = BeverageEntry.getBeverageName();
        String beverageCondiments = getCondimentString(BeverageEntry);
        String beverageData = beverageName + " with " + beverageCondiments;
        return beverageData;
    }

    private static double printPriceDallor(Beverage Beverage, int precision) {
        DoublePrecisionCompensator doublePrecisionCompensator = new DoublePrecisionCompensator();
        return doublePrecisionCompensator.correctPrecisionError(Beverage.cost(), precision);
    }

    private static String getCondimentString(BeverageEntry BeverageEntry) {
        String condimentString = "";
        String delimiter = ", ";
        HashMap<String, Integer> condimentMap = getCondimentMap(BeverageEntry);

        for (String condiment : condimentMap.keySet()) {
            int condimentCount = condimentMap.get(condiment);
            if (condimentCount == 1) {
                condimentString += condiment + delimiter;
            } else if (condimentCount == 2) {
                condimentString += "Double " + condiment + delimiter;
            } else if (condimentCount == 3) {
                condimentString += "Triple " + condiment + delimiter;
            }
        }
        condimentString = condimentString.substring(0, condimentString.length() - delimiter.length());
        return condimentString;
    }

    private static HashMap<String, Integer> getCondimentMap(BeverageEntry BeverageEntry) {
        HashMap<String, Integer> condimentMap = new HashMap<String, Integer>();
        ArrayList<String> condimentList = BeverageEntry.getCondimentList();
        for (String condiment : condimentList) {
            if (condimentMap.containsKey(condiment)) {
                condimentMap.put(condiment, condimentMap.get(condiment) + 1);
            } else {
                condimentMap.put(condiment, 1);
            }
        }
        return condimentMap;
    }
}
