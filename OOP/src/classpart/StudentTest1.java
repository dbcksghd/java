package classpart;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student(); //클래스형 변수이름 = new 생성자();
        student1.studentName = "유찬홍";
        System.out.println(student1.getStudentName());

        Student student2 = new Student(); //Student 클래스 변수로 student2를 선언하고 new Student();로 Student 클래스를 만들어서 student2에 넣겠다..이런얘기
        student2.studentName = "조병진";
        System.out.println(student2.getStudentName());
    }
}
