package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

import kr.ft.seoul.StrategyPattern.Student.Student;
import kr.ft.seoul.StrategyPattern.Subject.Grade.Grade;
import kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy.*;

public class MajorSubjectGradeTest extends TestBaseClass {
    int testMax = 1000;

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_00()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 95 and 100
            int score = (int)(Math.random() * 5) + 95;
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.S);
            assertTrue(isDefinitlyEqualsString("S", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_01()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 94 and 90
            int score = (int)(Math.random() * 5) + 90;
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.A);
            assertTrue(isDefinitlyEqualsString("A", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_02()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 89 and 80
            int score = (int)(Math.random() * 10) + 80;
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.B);
            assertTrue(isDefinitlyEqualsString("B", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_03()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 79 and 70
            int score = (int)(Math.random() * 10) + 70;
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.C);
            assertTrue(isDefinitlyEqualsString("C", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_04()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 69 and 60
            int score = (int)(Math.random() * 10) + 60;
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.D);
            assertTrue(isDefinitlyEqualsString("D", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Positive_05()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 59 and 0
            int score = (int)(Math.random() * 60);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade == Grade.F);
            assertTrue(isDefinitlyEqualsString("F", grade.toString()) == true);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_00()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 95 and 100
            int score = getRandomIntWithoutRange(0, 100, 95, 100);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.S);
            assertTrue(isDefinitlyEqualsString("S", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_01()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 90 and 94
            int score = getRandomIntWithoutRange(0, 100, 90, 94);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.A);
            assertTrue(isDefinitlyEqualsString("A", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_02()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 80 and 89
            int score = getRandomIntWithoutRange(0, 100, 80, 89);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.B);
            assertTrue(isDefinitlyEqualsString("B", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_03()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 70 and 79
            int score = getRandomIntWithoutRange(0, 100, 70, 79);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.C);
            assertTrue(isDefinitlyEqualsString("C", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_04()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 60 and 69
            int score = getRandomIntWithoutRange(0, 100, 60, 69);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.D);
            assertTrue(isDefinitlyEqualsString("D", grade.toString()) == false);
        }
    }

    @Test
    public void GradeTest_MajorSubjectGrading_Negative_05()
    {
        SubjectGradingStrategy subjectGradingStrategy = new MajorSubjectGradingStrategy();

        for (int i = 0; i < testMax; i++)
        {
            // get random int between 0 and 100 without range between 0 and 59
            int score = getRandomIntWithoutRange(0, 100, 0, 59);
            Grade grade = subjectGradingStrategy.getGradeByScore(score);
            assertTrue(grade != Grade.F);
            assertTrue(isDefinitlyEqualsString("F", grade.toString()) == false);
        }
    }
}
