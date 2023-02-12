package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import static org.junit.Assert.*;

import kr.ft.seoul.StrategyPattern.Student.Student;
import kr.ft.seoul.StrategyPattern.Student.Exception.StudentIdException;

public class StudentTest extends TestBaseClass {
    int testMax = 1000;
    String expectedExceptionMessage_id = "학번은 0 이상의 양의 정수여야 합니다.";
    
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void StudentTest_creation_Positive_00()
    {
        for (int i = 0; i < testMax; i++)
        {
            int id = getRandomInt(0, 100000);
            String name = getRandomString(12);

            Student student = new Student(id, name);
            assertTrue(student != null);
            assertTrue(student.getId() == id);
            assertTrue(isDefinitlyEqualsString(name, student.getName()) == true);
        }
    }

    @Test
    public void StudentTest_creation_Positive_name()
    {
        for (int i = 0; i < testMax; i++)
        {
            int id = 42;
            String name = getRandomString(12);

            Student student = new Student(id, name);
            assertTrue(isDefinitlyEqualsString(name, student.getName()) == true);
        }
    }

    @Test
    public void StudentTest_creation_Positive_id()
    {
        for (int i = 0; i < testMax; i++)
        {
            int id = getRandomInt(0, 100000);
            String name = "John Doe";

            Student student = new Student(id, name);
            assertTrue(student.getId() == id);
        }
    }

    @Test
    public void StudentTest_creation_Negative_id()
    {
        expectedException.expect(StudentIdException.class);
        expectedException.expectMessage(expectedExceptionMessage_id);
        for (int i = 0; i < testMax; i++)
        {
            int id = getRandomInt(1, 100000) * -1;
            String name = "John Doe";

            Student student = new Student(id, name);
        }
    }
}
