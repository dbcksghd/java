import java.util.ArrayList;

public class SpecialStudyRoom extends Studyroom {
    Television television = new Television();
    SpecialStudyRoom(String studyRoomName, ArrayList<Student> studentList) {
        super(studyRoomName, studentList);
    }

    public void getWatchingTVStudentList(){
        for (Student student: students) {
            System.out.print(student.getName() + " ");
        }
        System.out.print("님 들이 ");
        television.watchingTV();
    }

}
