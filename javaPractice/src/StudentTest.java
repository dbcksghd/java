public class StudentTest {
    public static void main(String[] args) {
        Student studentYoo = new Student(3, "유찬홍");
        studentYoo.setKorea(100);
        studentYoo.setMath(100);

        Student studentKwon = new Student(14, "권하은");
        studentKwon.setKorea(85);
        studentKwon.setMath(60);

        studentYoo.showStudentInfo();
        studentKwon.showStudentInfo();
    }
}
