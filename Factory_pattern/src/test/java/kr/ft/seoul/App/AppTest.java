package kr.ft.seoul.oop_study.test;

import kr.ft.seoul.App.Car.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

import kr.ft.seoul.oop_study.test.CarTest.CarTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CarTestSuite.class
})
public class AppTest {
}
