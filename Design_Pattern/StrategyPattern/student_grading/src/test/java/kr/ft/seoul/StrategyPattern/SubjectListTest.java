package kr.ft.seoul.StrategyPattern;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

import java.util.ArrayList;

import kr.ft.seoul.StrategyPattern.Subject.Subject;
import kr.ft.seoul.StrategyPattern.Subject.SubjectList;

public class SubjectListTest extends TestBaseClass {
    int testMax = 1000;

    @Test
    public void SubjectListTest_creation_Positive()
    {
        SubjectList subjectList = new SubjectList();
        assertTrue(subjectList != null);
    }

    @Test
    public void SubjectListTest_addSubject_Positive()
    {
        SubjectList subjectList = new SubjectList();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            assertTrue(subjectList.getSubjectCount() == i + 1);
        }
    }

    @Test
    public void SubjectListTest_addSubject_Positive_duplicatedSubject()
    {
        SubjectList subjectList = new SubjectList();

        for (int i = 0; i < testMax; i++)
        {
            String name = "Korean";
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            assertTrue(subjectList.getSubjectCount() == 1);
        }
    }

    @Test
    public void SubjectListTest_getSubject_Positive()
    {
        SubjectList subjectList = new SubjectList();
        ArrayList<Subject> subjectArrayList = new ArrayList<Subject>();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            subjectArrayList.add(subject);
            for (int j = 0; j < subjectArrayList.size(); j++)
            {
                assertTrue(subjectList.getSubject(subjectArrayList.get(j).getName()) != null);
            }
        }
    }

    @Test
    public void SubjectListTest_getSubject_Negative()
    {
        SubjectList subjectList = new SubjectList();
        
        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(30);
            assertTrue(subjectList.getSubject(name) == null);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
        }
    }

    @Test
    public void SubjectListTest_getSubjectCount_Positive()
    {
        SubjectList subjectList = new SubjectList();
        ArrayList<Subject> subjectArrayList = new ArrayList<Subject>();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            subjectArrayList.add(subject);
            assertTrue(subjectList.getSubjectCount() == subjectArrayList.size());
        }
    }

    @Test
    public void SubjectListTest_getSubjectCount_Negative()
    {
        SubjectList subjectList = new SubjectList();
        ArrayList<Subject> subjectArrayList = new ArrayList<Subject>();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            assertFalse(subjectList.getSubjectCount() == subjectArrayList.size());
            subjectArrayList.add(subject);
        }
    }

    @Test
    public void SubjectListTest_removeSubject_Positive_00()
    {
        SubjectList subjectList = new SubjectList();
        ArrayList<Subject> subjectArrayList = new ArrayList<Subject>();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            subjectArrayList.add(subject);
            subjectList.removeSubject(subject);
            assertFalse(subjectList.getSubjectCount() == subjectArrayList.size());
        }
    }

    @Test
    public void SubjectListTest_removeSubject_Positive_01()
    {
        SubjectList subjectList = new SubjectList();
        ArrayList<Subject> subjectArrayList = new ArrayList<Subject>();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);
            subjectList.addSubject(subject);
            subjectArrayList.add(subject);
            subjectList.removeSubject(name);
            assertFalse(subjectList.getSubjectCount() == subjectArrayList.size());
        }
    }

    @Test
    public void SubjectListTest_removeSubject_Negative_00()
    {
        SubjectList subjectList = new SubjectList();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);

            subjectList.removeSubject(subject);
            assertTrue(subjectList.getSubjectCount() == i);
            subjectList.addSubject(subject);
        }
    }

    @Test
    public void SubjectListTest_removeSubject_Negative_01()
    {
        SubjectList subjectList = new SubjectList();

        for (int i = 0; i < testMax; i++)
        {
            String name = getRandomString(12);
            Subject subject = new Subject(name, 100, true);

            subjectList.removeSubject(name);
            assertTrue(subjectList.getSubjectCount() == i);
            subjectList.addSubject(subject);
        }
    }
}