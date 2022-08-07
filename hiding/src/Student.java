public class Student {
    int studentID;
    private String studentName;
    int grade;
    String address;


    public String getStudentName(){ //private 변수인 studentName에 접근해서 값을 가져올수 있게 함
        return studentName;
    }

    public void setStudentName(String studentName){ // studentName에 접근해서 값을 지정할수 있게 함
        this.studentName = studentName;
    }
}
