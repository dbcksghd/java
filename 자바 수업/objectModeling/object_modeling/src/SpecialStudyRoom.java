import java.util.ArrayList;

public class SpecialStudyRoom extends Studyroom {
    public ArrayList<Student> students = new ArrayList<>();
    Television television = new Television();
    SpecialStudyRoom(String studyRoomName, ArrayList<Student> studentList) {
        super(studyRoomName, studentList);
        this.students.addAll(studentList);
    }

    public void turnOnTVByStudent(){
        for (Student student: students) {
            System.out.print(student.getName() + " ");
        }
        System.out.print("님 들이 ");
        television.turnOnTV();
    }

    public void study(){
        super.study();
    }
}
