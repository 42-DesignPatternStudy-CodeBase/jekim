package kr.ft.seoul.oop_study.test.CarFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import kr.ft.seoul.oop_study.test.CarFactoryTest.FirstCarFactory.*;
import kr.ft.seoul.oop_study.test.CarFactoryTest.SecondCarFactory.*;
import kr.ft.seoul.oop_study.test.CarFactoryTest.ThirdCarFactory.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    FirstCarFactoryPositiveTest.class,
    FirstCarFactoryNegativeTest.class,
    SecondCarFactoryPositiveTest.class,
    SecondCarFactoryNegativeTest.class,
    ThirdCarFactoryPositiveTest.class,
    ThirdCarFactoryNegativeTest.class
})
public class CarFactoryTestSuite {
}