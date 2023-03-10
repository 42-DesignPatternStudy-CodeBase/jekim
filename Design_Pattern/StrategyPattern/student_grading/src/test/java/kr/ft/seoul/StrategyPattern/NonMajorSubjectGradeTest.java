package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

import kr.ft.seoul.StrategyPattern.Student.Student;
import kr.ft.seoul.StrategyPattern.Subject.Grade.Grade;
import kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy.*;

public class NonMajorSubjectGradeTest extends TestBaseClass {
    int testMax = 1000;

    @Test
    public void GradeTest_NonMajorSubjectGrading_Positive_00()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(90, 100);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.A);
            assertTrue(isDefinitlyEqualsString("A", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Positive_01()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(80, 89);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.B);
            assertTrue(isDefinitlyEqualsString("B", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Positive_02()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(70, 79);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.C);
            assertTrue(isDefinitlyEqualsString("C", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Positive_03()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(55, 69);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.D);
            assertTrue(isDefinitlyEqualsString("D", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Positive_04()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            int score = getRandomInt(0, 54);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.F);
            assertTrue(isDefinitlyEqualsString("F", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Negative_00()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range 90 ~ 100
            int score = getRandomIntWithoutRange(0, 100, 90, 100);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.A);
            assertTrue(isDefinitlyEqualsString("A", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Negative_01()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range 80 ~ 89
            int score = getRandomIntWithoutRange(0, 100, 80, 89);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.B);
            assertTrue(isDefinitlyEqualsString("B", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Negative_02()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range 70 ~ 79
            int score = getRandomIntWithoutRange(0, 100, 70, 79);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.C);
            assertTrue(isDefinitlyEqualsString("C", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Negative_03()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range 60 ~ 69
            int score = getRandomIntWithoutRange(0, 100, 55, 69);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.D);
            assertTrue(isDefinitlyEqualsString("D", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_NonMajorSubjectGrading_Negative_04()
    {
        SubjectGradingStrategy subjectGradingStrategy = new NonMajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range 0 ~ 59
            int score = getRandomIntWithoutRange(0, 100, 0, 55);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.F);
            assertTrue(isDefinitlyEqualsString("F", grade.toString()) == false);
        }
    }
}
