public class Student extends Person {
    final private int number;

    Student(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void turnOnTV(Television television) {
        System.out.println(getName() + television.turnOnTV());
    }
}