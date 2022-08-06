package generators;

public class Person {
    String name;
    float height;
    float weight;

    public Person(){}//생성자가 없는 클래스를 컴파일할때 자동으로 생성자를 만들어줌
                     // 이런 애를 디폴트 생성자라고 부름.


    public Person(String pname) {
        name = pname;
    }


}
