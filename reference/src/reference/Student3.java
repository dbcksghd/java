package reference;

public class Student3 {
    int studentID;
    String studentName;
    Subject korean;
    Subject math;
}
/*
기존에는 Student2 클래스에 과목이름을 따로 추가하면 koreanSubjectName, mathSubjectName 두 변수를 추가해야했을것이다.
하지만 이렇게 만들면 subjectName은 Subject 클래스에 선언하면 된다. 그리고 과목 이름을 korean.subjectName으로,
수학은 math.subjectName으로 사용할수 있어서 편리하다.
 */