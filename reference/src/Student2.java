public class Student2 {
    int studentID;
    String studentName;
    int koreaScore;
    int mathScore;
    String koreaSubject; //과목 이름 변수 추가
    String mathSubject;
}

/*이렇게 만들면 학생에 대한 클래스에 과목변수만 너무 늘어나서 지저분하다.
과목 이름과 성적을 Subject라는 클래스로 분리하고 Student에 Subject 변수를 각 과목별로 추가하면 더 깔끔하지 않을까?
 */