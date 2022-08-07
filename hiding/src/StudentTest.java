public class StudentTest {
    public static void main(String[] args) {
        Student studentYoo = new Student();
        //studentYoo.studentName = "유찬홍"; private때문에 외부 클래스의 접근이 허용되지 않기 때문에 오류가 남
        studentYoo.setStudentName("유찬홍"); //setStudentName() 메소드를 이용해서 private 변수에 접근할 수 있다.

        System.out.println(studentYoo.getStudentName());
    }
}
