
class Person{
    String name;
    int age;

    public Person(){
        //name = "test"; this를 이용하여 생성자를 호출할경우 다른게 앞에 있으면 오류남
        this("이름 없음", 1); //this를 사용해 Person(String, int) 생성자 호출
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}


public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
