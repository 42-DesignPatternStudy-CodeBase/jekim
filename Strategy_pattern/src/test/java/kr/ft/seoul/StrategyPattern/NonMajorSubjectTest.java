package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import static org.junit.Assert.*;

import kr.ft.seoul.StrategyPattern.Subject.*;
import kr.ft.seoul.StrategyPattern.Subject.Exception.GradeException;

public class NonMajorSubjectTest extends TestBaseClass {
    int testMax = 1000;
    String expectedExceptionMessage = "점수는 0 ~ 100 사이의 값이어야 합니다.";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void NonMajorSubjectTest_creation_Positive_name()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = 100;
            String name = getRandomString(8);
            Subject subject = new Subject(name, score, false);

            assertTrue(isDefinitlyEqualsString(name, subject.getName()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_isMajor_Positive()
    {
        for (int i = 0; i < testMax; i++)
        {
            Subject subject = new Subject("Korean", 100, true);
            assertTrue(subject.isMajor() == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_isMajor_Negative()
    {
        for (int i = 0; i < testMax; i++)
        {
            Subject subject = new Subject("Korean", 100, false);
            assertTrue(subject.isMajor() == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Positive_A()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(90, 100);
            Subject subject = new Subject("Korean", score, false);

            assertEquals(score, subject.getScore());
            assertTrue(isDefinitlyEqualsString("A", subject.getGrade()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Positive_B()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(80, 89);
            Subject subject = new Subject("Korean", score, false);

            assertEquals(score, subject.getScore());
            assertTrue(isDefinitlyEqualsString("B", subject.getGrade()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Positive_C()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(70, 79);
            Subject subject = new Subject("Korean", score, false);

            assertEquals(score, subject.getScore());
            assertTrue(isDefinitlyEqualsString("C", subject.getGrade()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Positive_D()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(55, 69);
            Subject subject = new Subject("Korean", score, false);

            assertEquals(score, subject.getScore());
            assertTrue(isDefinitlyEqualsString("D", subject.getGrade()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Positive_F()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(0, 54);
            Subject subject = new Subject("Korean", score, false);

            assertEquals(score, subject.getScore());
            assertTrue(isDefinitlyEqualsString("F", subject.getGrade()) == true);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Negative_A()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomIntWithoutRange(0, 100, 90, 100);
            Subject subject = new Subject("Korean", score, false);

            assertTrue(isDefinitlyEqualsString("A", subject.getGrade()) == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Negative_B()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomIntWithoutRange(0, 100, 80, 89);
            Subject subject = new Subject("Korean", score, false);

            assertTrue(isDefinitlyEqualsString("B", subject.getGrade()) == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Negative_C()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomIntWithoutRange(0, 100, 70, 79);
            Subject subject = new Subject("Korean", score, false);

            assertTrue(isDefinitlyEqualsString("C", subject.getGrade()) == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Negative_D()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomIntWithoutRange(0, 100, 55, 69);
            Subject subject = new Subject("Korean", score, false);

            assertTrue(isDefinitlyEqualsString("D", subject.getGrade()) == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_score_Negative_F()
    {
        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomIntWithoutRange(0, 100, 0, 54);
            Subject subject = new Subject("Korean", score, false);

            assertTrue(isDefinitlyEqualsString("F", subject.getGrade()) == false);
        }
    }

    @Test
    public void NonMajorSubjectTest_Exception_00()
    {
        expectedException.expect(GradeException.class);
        expectedException.expectMessage(expectedExceptionMessage);

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(101, 10000);
            Subject subject = new Subject("Korean", score, false);
        }
    }

    @Test
    public void NonMajorSubjectTest_Exception_01()
    {
        expectedException.expect(GradeException.class);
        expectedException.expectMessage(expectedExceptionMessage);

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(0, 10000) * -1;
            Subject subject = new Subject("Korean", score, false);
        }
    }

}