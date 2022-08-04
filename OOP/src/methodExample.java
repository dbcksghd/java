public class methodExample {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name){ //학생 이름을 매개변수로 전달
        studentName = name; //studentName 값에 문자열 name을 입력받아서 넣을수 있도록 만들어준다
        //반환값은 없으니까 void
    }
}
/*메소드 이름을 지을때는 해당 클래스를 사용하는 코드 입장에서 짓는게 좋다.
클래스 이름은 methodExample지만 Student라고 가정해보자. 이 클래스에서 학생 이름(studentName)을 가져오는(get)기능을
구현하는 메소드 이름은 getStudentName으로 지을수 있다.
 */
