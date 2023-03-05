package kr.ft.seoul.App.test;

import kr.ft.seoul.App.Car.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

import kr.ft.seoul.App.test.CarFactoryTest.CarFactoryTestSuite;
import kr.ft.seoul.App.test.CarTest.CarTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CarTestSuite.class,
    CarFactoryTestSuite.class
})
public class AppTest {
}
