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

public class MainTest extends TestBaseClass {
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
        // System.setOut(new PrintStream(outputMessage));

        Student student = new Student(1001, "Lee");
        final String expectedOutput = "학생 Lee의 국어 과목 성적은 100점이고, 학점은 A입니다.\n학생 Lee의 수학 과목 성적은 100점이고, 학점은 S입니다.\n";

        student.addSubject("국어", 100, false);
        student.addSubject("수학", 100, true);

        student.showGradeInfo();

        assertEquals(expectedOutput, outputMessage.toString());

        // System.setOut(originalOut);
    }

    @Test
    public void ExampleCase_01()
    {
        // System.setOut(new PrintStream(outputMessage));
        
        Student student = new Student(1002, "Kim");
        final String expectedOutput = "학생 Kim의 국어 과목 성적은 55점이고, 학점은 F입니다.\n학생 Kim의 수학 과목 성적은 55점이고, 학점은 D입니다.\n학생 Kim의 영어 과목 성적은 100점이고, 학점은 A입니다.\n";

        student.addSubject("국어", 55, true);
        student.addSubject("수학", 55, false);
        student.addSubject("영어", 100, false);

        student.showGradeInfo();

        assertEquals(expectedOutput, outputMessage.toString());

        // System.setOut(originalOut);
    }
}