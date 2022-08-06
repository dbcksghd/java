package overload;

public class PersonTest {
    public static void main(String[] args) {
        Person personYoo = new Person(); // 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로따로 초기화한것
        personYoo.name = "유찬홍";
        personYoo.weight = 46.5F;
        personYoo.height = 163.7F;

        Person personCho = new Person("조병진", 54.8F, 168.2F); // 생성과 초기화를 동시에
    }
}
