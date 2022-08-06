package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentCho = new Student(); //Student 클래스 생성
        studentCho.studentName = "조병진";

        System.out.println(studentCho.studentName);
        System.out.println(studentCho.getStudentName());
    }
}
