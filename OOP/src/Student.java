public class Student { //클래스 이름은 대문자로 짓는게 국룰
    int studentID; //학번
    String studentName; // 학생 이름
    int grade; // 학년
    String address; //사는 곳

    public void showStudentInfo(){ //이름과 주소를 출력하는 메소드
        System.out.println(studentName + "," + address);
    }
}

//이렇게 클래스 내부에 선언해서 객체 속성을 나타내는 변수를 멤버 변수라고 부름

//클래스 내부에서 멤버 변수를 사용하여 클래스 기능을 구현한것을 멤버 함수, 메소드라고 부름