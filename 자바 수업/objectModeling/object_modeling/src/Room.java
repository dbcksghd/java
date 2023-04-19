import java.util.ArrayList;

public class Room {
    final private ArrayList<String> persons = new ArrayList<>();
    final private int roomNumber;
    Room(ArrayList<String> personList, int roomNumber) {
        persons.addAll(personList);
        this.roomNumber = roomNumber;
    }

    public void getRoomLivingPersonList(){
        System.out.println(persons + "님 들이 사용중입니다.");
    }

    public void getRoomNumber(){
        System.out.println(roomNumber + "호 입니다.");
    }

    public void sleep(){
        System.out.println("불을 끕니다.");
    }
}
