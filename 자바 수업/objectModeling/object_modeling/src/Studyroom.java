import java.util.ArrayList;

public class Studyroom extends Room {
    Studyroom(String studyRoomName, ArrayList<Student> studentList) {
        super(studyRoomName, studentList);
    }

    public void study() {
        System.out.println(roomName + "에서 공부하는 중입니다.");
    }

    @Override
    public void getUsingRoomStudentList() {
        for (Student student: students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println("님 들이 공부중입니다.");
    }
}