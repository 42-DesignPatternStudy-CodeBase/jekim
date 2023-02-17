package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import kr.ft.seoul.StrategyPattern.Student.Student;
import kr.ft.seoul.StrategyPattern.Subject.Grade.SubjectGradingStrategy.*;

public class MainTest extends TestBaseClass {
    int testMax = 1000;
    ByteArrayOutputStream outputMessage;
    final PrintStream originalOut = System.out;

    @Before
    public void beforeEach() {
        outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));
    }

    @After
    public void afterEach() {
        System.setOut(originalOut);
    }

    @Test
    public void ExampleCase_00()
    {
        Student student = new Student(1001, "Lee");
        final String expectedOutput =
                "학생 Lee의 국어 과목 성적은 100점이고, 학점은 A입니다.\n"
            +   "학생 Lee의 수학 과목 성적은 100점이고, 학점은 S입니다.\n";
        


        student.addSubject("국어", 100, false);
        student.addSubject("수학", 100, true);

        student.showGradeInfo();

        assertEquals(expectedOutput, outputMessage.toString());
    }

    @Test
    public void ExampleCase_01()
    {   
        Student student = new Student(1002, "Kim");
        final String expectedOutput = 
                "학생 Kim의 국어 과목 성적은 55점이고, 학점은 F입니다.\n"
            +   "학생 Kim의 수학 과목 성적은 55점이고, 학점은 D입니다.\n"
            +   "학생 Kim의 영어 과목 성적은 100점이고, 학점은 A입니다.\n";

        student.addSubject("국어", 55, true);
        student.addSubject("수학", 55, false);
        student.addSubject("영어", 100, false);

        student.showGradeInfo();

        assertEquals(expectedOutput, outputMessage.toString());
    }

    @Test
    public void ExampleCase_02()
    {
        for (int i = 0; i < testMax; i++)
        {
            beforeEach();
            randomCase_routine_oneline();
            afterEach();
        }
    }

    @Test
    public void ExampleCase_03()
    {
        for (int i = 0; i < testMax; i++)
        {
            beforeEach();
            randomCase_routine_multiline();
            afterEach();
        }
    }

    private void randomCase_routine_oneline() {
        String studentName = getRandomString(8);
        int score = getRandomInt(0, 100);
        String subjectName = getRandomString(8);
        boolean isMajor = getRandomInt(0, 100) % 2 == 0 ? true : false;
        SubjectGradingStrategy subjectGradingStrategy = isMajor ? new MajorSubjectGradingStrategy() : new NonMajorSubjectGradingStrategy();

        Student student = new Student(1000, studentName);
        student.addSubject(subjectName, score, isMajor);

        final String expectedOutput = String.format(
            "학생 %s의 %s 과목 성적은 %d점이고, 학점은 %s입니다.\n",
            studentName,
            subjectName,
            score,
            subjectGradingStrategy.getGradeByScore(score).toString());

        student.showGradeInfo();

        assertEquals(expectedOutput, outputMessage.toString());
    }

    private void randomCase_routine_multiline() {
        final int testSubjectCount = 100;

        String studentName = getRandomString(8);
        String expectedOutput = "";
        Student student = new Student(1000, studentName);

        for (int i = 0; i < testSubjectCount; i++)
        {
            int score = getRandomInt(0, 100);
            String subjectName = getRandomString(8);
            boolean isMajor = getRandomInt(0, 100) % 2 == 0 ? true : false;
            SubjectGradingStrategy subjectGradingStrategy = isMajor ? new MajorSubjectGradingStrategy() : new NonMajorSubjectGradingStrategy();

            student.addSubject(subjectName, score, isMajor);

            expectedOutput = expectedOutput + String.format(
                "학생 %s의 %s 과목 성적은 %d점이고, 학점은 %s입니다.\n",
                studentName,
                subjectName,
                score,
                subjectGradingStrategy.getGradeByScore(score).toString());
        }
        student.showGradeInfo();
        assertEquals(expectedOutput, outputMessage.toString());
    }
}