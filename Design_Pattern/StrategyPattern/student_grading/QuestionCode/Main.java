package strategy.sub02;
​

// 전공 과목인 경우 학점 계산은 아래를 참고한다.
// S = 100 ~ 95
// A = 94 ~ 90
// B = 89 ~ 80
// C = 79 ~ 70
// D = 69 ~ 60
// F = 59 ~ 0

// 전공 과목이 아닌 경우 학점 계산은 아래를 참고한다.
// A = 100 ~ 90
// B = 89 ~ 80
// C = 79 ~ 70
// D = 69 ~ 60
// F = 59 ~ 0

public class StudentTest { 
    public static void main(String[] args) { 
      Student studentLee = new Student(1001, "Lee"); 
       
      studentLee.addSubject("국어", 100, false); 
      studentLee.addSubject("수학", 100, true); 
       
       
      Student studentKim = new Student(1002, "Kim"); 
       
      studentKim.addSubject("국어", 55, true); 
      studentKim.addSubject("수학", 55, false); 
      studentKim.addSubject("영어", 100, false); 
       
      studentLee.showGradeInfo(); 
      System.out.println("======================================"); 
      studentKim.showGradeInfo(); 
    } 
}

// 출력폼
// 학생 Lee의 국어 과목 성적은 100점이고, 학점은 A입니다.
// 학생 Lee의 수학 과목 성적은 100점이고, 학점은 S입니다.
// ======================================
// 학생 Kim의 국어 과목 성적은 55점이고, 학점은 F입니다.
// 학생 Kim의 수학 과목 성적은 55점이고, 학점은 D입니다.
// 학생 Kim의 영어 과목 성적은 100점이고, 학점은 A입니다.


// 학생 {StudentName}의 {SubjectName} 과목 성적은 {Score}점이고, 학점은 {Grade}입니다.