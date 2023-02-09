package CaffeKiosk.Beverage;

public abstract class Beverage {
    private String name;
    private String description;
    private double price;
    private BeverageSizeEnum size;

    public Beverage(String name, String description, double price, BeverageSizeEnum size) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public BeverageSizeEnum getSize() {
        return size;
    }

    public void setSize(BeverageSizeEnum size) {
        this.size = size;
    }

    public abstract double cost();
}