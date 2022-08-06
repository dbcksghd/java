package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) { //main 함수
        Student studentYoo = new Student(); //Student 클래스 생성
        studentYoo.studentName = "유찬홍";

        System.out.println(studentYoo.studentName);
        System.out.println(studentYoo.getStudentName());
    }
}
