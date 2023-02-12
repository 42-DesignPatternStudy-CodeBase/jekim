package CaffeKiosk.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("DarkRoast", "DarkRoast", 1.00, BeverageSizeEnum.TALL);
    }

    public DarkRoast(BeverageSizeEnum size) {
        super("DarkRoast", "DarkRoast", 1.00, size);
    }
}
