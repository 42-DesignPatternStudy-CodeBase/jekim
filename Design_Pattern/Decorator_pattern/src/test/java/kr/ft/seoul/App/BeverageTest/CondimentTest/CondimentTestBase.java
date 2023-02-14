package kr.ft.seoul.App.test.BeverageTest.CondimentTest;

public class CondimentTestBase {
    protected boolean isDefinitlyEqualsString(String str1, String str2) {
        return str1.compareTo(str2) == 0;
    }

    protected boolean isDefinitlyEqualsDouble(double d1, double d2) {
        return d1 == d2;
    }
}
