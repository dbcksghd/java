import java.util.ArrayList;

public class SpecialStudyRoom extends Studyroom {

    SpecialStudyRoom(String studyRoomName, ArrayList<String> persons) {
        super(studyRoomName, persons);
    }

    public void turnOnTVByPerson(String person) {
        System.out.println(person + " 이/가 TV를 켰다.");
    }
}
