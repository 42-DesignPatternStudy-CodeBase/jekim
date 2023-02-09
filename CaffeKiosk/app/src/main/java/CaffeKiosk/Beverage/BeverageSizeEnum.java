package CaffeKiosk.Beverage;

// Size에 대한 Enum 클래스
// Size에 따른 가격은 Condiment 추상 클래스의 자식 클래스에서 사용된다.
// Condiment 추상 클래스의 자식 클래스에서 사이즈 별로 할증된 가격을 가진다.
public enum BeverageSizeEnum {
    SMALL(0),
    MEDIUM(0.2),
    LARGE(0.5);

    private double size;

    BeverageSizeEnum(double size) {
        this.size = size;
    }

    public double getExtraPriceBySize() {
        return size;
    }
}
