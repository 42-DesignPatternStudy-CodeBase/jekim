package kr.ft.seoul.StrategyPattern.Student;

import kr.ft.seoul.StrategyPattern.Subject.SubjectList;
import kr.ft.seoul.StrategyPattern.Subject.Subject;

public class Student {
    int id;
    String name;
    SubjectList subjectList;

    private Student() {};

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        subjectList = new SubjectList();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubject(Subject subject) {
        subjectList.addSubject(subject);
    }

    public void removeSubject(Subject subject) {
        subjectList.removeSubject(subject);
    }

    public void removeSubject(String subjectName) {
        subjectList.removeSubject(subjectName);
    }

    public SubjectList getSubjectList() {
        return this.subjectList;
    }
}
