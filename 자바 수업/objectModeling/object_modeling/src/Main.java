import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("유찬홍", 14);
        Student student1 = new Student("엄준식", 10);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        Studyroom studyroom = new Studyroom("4층 자습실", studentList);
        studyroom.study();
        studyroom.getRoomUsePersonList();

        SpecialStudyRoom specialStudyRoom = new SpecialStudyRoom("가온실", studentList);
        specialStudyRoom.turnOnTVByStudent();
        Student student2 = new Student("박준하", 8);
        Student student3 = new Student("이재동", 15);
        ArrayList<Student> roomLiveList = new ArrayList<>(List.of(student, student2, student3));
        Room room = new Room("408호", roomLiveList);
        room.getRoomName();
        room.getRoomUsePersonList();
        room.sleep();
        room.sleep(12, 10);
    }
}