package kr.ft.seoul.App.CarFactory.CarFactory_01;

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