package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "유찬홍"; // 도트 연산자(.)로 참조할수 있다. ex) c드라이브에 내pc에 내 사진 -> c드라이브.내pc.내사진
        Student student2 = new Student();
        student2.studentName = "조병진"; // student2 인스턴스의 studentName 변수에 조병진을 넣는다.

        System.out.println(student1); //참조 변수 값 출력
        System.out.println(student2); //클래스 이름.주소값이 출력된다.
    }
}

/*
용어 정리
객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
인스턴스 : 클래스가 메모리에 생성된 상태
멤버 변수 : 클래스의 속성, 특성
메소드 : 멤버 변수를 사용하여 클래스의 기능을 구현
참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
참조 값 : 생성된 인스턴스의 메모리 주소 값
 */