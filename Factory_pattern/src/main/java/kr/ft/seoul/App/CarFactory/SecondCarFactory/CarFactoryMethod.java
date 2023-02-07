package kr.ft.seoul.App.CarFactory.SecondCarFactory;

import kr.ft.seoul.App.Car.*;

public enum CarFactoryMethod {
    SONATA {
        protected String modelName = "Sonata";
        protected Car create() {
            return new Sonata();
        }
    },
    GRANDEUR {
        protected String modelName = "Grandeur";
        protected Car create() {
            return new Grandeur();
        }
    },
    GENESIS {
        protected String modelName = "Genesis";
        protected Car create() {
            return new Genesis();
        }
    },
    DEFAULT {
        protected String modelName = "Noname";
        protected Car create() {
            return new Car("Noname");
        }
    };

    abstract protected Car create();
}

// Enum type은 추상메소드를 가질 수 있습니다.
// Enum type내에서 선언된 추상메소드는 constant의 내부에서 구현을 할 수 있습니다.