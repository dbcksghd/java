import java.util.ArrayList;

public class Room {
    final public ArrayList<Student> students = new ArrayList<>();
    final public String roomName;

    Room(String roomName, ArrayList<Student> personList) {
        students.addAll(personList);
        this.roomName = roomName;
    }

    public void getRoomUsePersonList() {
        for (Student student: students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println("님 들이 생활하고 있습니다.");
    }

    public void getRoomName() {
        System.out.println(roomName + " 입니다.");
    }

    public void sleep() {
        System.out.println("불을 끕니다.");
    }

    public void sleep(int hour, int min){
        System.out.println(hour + "시 " + min + "분에 불을 끕니다.");
    }
}
