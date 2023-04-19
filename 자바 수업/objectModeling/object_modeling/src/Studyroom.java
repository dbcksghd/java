import java.util.ArrayList;

public class Studyroom {
    final private String studyRoomName;

    final private ArrayList<String> persons = new ArrayList<>();

    Studyroom(String studyRoomName, ArrayList<String> personNameList) {
        this.studyRoomName = studyRoomName;
        this.persons.addAll(personNameList);
    }

    public void study() {
        System.out.println(studyRoomName + "에서 공부하는 중입니다.");
    }

    public void getStudingPeopleName() {
        for (String person : persons) {
            System.out.print(person);
            if (persons.indexOf(person) == 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" 님들이 공부중입니다.");
    }
}