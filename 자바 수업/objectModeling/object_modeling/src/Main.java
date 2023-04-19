import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("유찬홍");
        Person person1 = new Person("엄준식");
        ArrayList<String> personList = new ArrayList<>();
        personList.add(person1.name);
        personList.add(person.name);

        Studyroom studyroom = new Studyroom("4층 자습실", personList);
        studyroom.getStudingPeopleName();
        studyroom.study();

        SpecialStudyRoom specialStudyRoom = new SpecialStudyRoom("가온실", personList);
        specialStudyRoom.turnOnTVByPerson(person.name);

        ArrayList<String> roomLiveList = new ArrayList<>(List.of("유찬홍", "박준하", "이재동"));
        Room room = new Room(roomLiveList, 408);
        room.getRoomNumber();
        room.getRoomLivingPersonList();
        room.sleep();
    }
}