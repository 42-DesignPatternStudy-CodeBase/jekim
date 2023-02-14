package kr.ft.seoul.App.Calculator;

public class DoublePrecisionCompensator {
    private int base = 10;

    public void setBase(int base) {
        this.base = base;
    }

    public double correctPrecisionError(double value, int precision) {
        int correctionValue = (int)Math.pow(this.base, (precision - 1));
        return Math.ceil(value * correctionValue) / correctionValue;
    }
}
