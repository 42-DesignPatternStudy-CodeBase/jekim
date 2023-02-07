package kr.ft.seoul.App.CarFactory.CarFactory_00;

import kr.ft.seoul.App.Car.*;
import java.util.function.Supplier;

public enum CarProduct {
    SONATA("Sonata", Sonata::new),
    GRANDEUR("Grandeur", Grandeur::new),
    GENESIS("Genesis", Genesis::new);

    private final String productName;
    private final Supplier<Car> instantiator;

    CarProduct(final String productName, Supplier<Car> instantiator) {
        this.productName = productName;
        this.instantiator = instantiator;
    }

    public static Car getDefalutCarProduct() {
        return new Car("Noname");
    }

    public static Car getCarProduct(final String carName) {
        for (CarProduct carProduct : CarProduct.values()) {
            if (carProduct.productName == carName) {
                return carProduct.instantiator.get();
            }
        }
        return getDefalutCarProduct();
    }
}
// 부연 설명 util.function.Supplier<T>
// Supplier<T>를 통해 특정 클래스의 생성자를 타입화하여 다룰 수 있습니다.
// Supplier<T>는 T타입을 받습니다. 클래스도 가능.
// Supplier<T>.get()은 T를 리턴하여 줍니다.

// 부연 설명 Enum Type
// java의 enum type 내부에는 enum constants와 이에 연관된 parameter를 가질 수 있습니다.
// enum constant가 어떻게 parameter를 가질지는 필드의 데이터와 생성자를 이용해서 관리합니다.
// enum type은 내부의 constant들을 관리하는 메소드를 정의할 수 있습니다.
// enum.values() 를 이용하면 각 constant와 parameter들을 이용하여 반복자처럼 활용할 수 있습니다.