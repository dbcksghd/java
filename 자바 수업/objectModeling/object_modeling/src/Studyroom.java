import java.util.ArrayList;

public class Studyroom extends Room {
    public ArrayList<Student> students = new ArrayList<>();
    Studyroom(String studyRoomName, ArrayList<Student> studentList) {
        super(studyRoomName, studentList);
        this.students.addAll(studentList);
    }

    public void study() {
        System.out.println(roomName + "에서 공부하는 중입니다.");
    }

    @Override
    public void getRoomUsePersonList() {
        for (Student student: students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println("님 들이 공부중입니다.");
    }
}