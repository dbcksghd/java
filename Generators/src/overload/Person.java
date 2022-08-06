package overload;

public class Person {
    String name;
    float height;
    float weight;

    public Person(){} //디폴트 생성자

    public Person(String pname){ //이름을 매개변수로 입력받는 생성자
        name = pname;
    }
    public Person(String pname, float pheight, float pweight){ // 이름, 키, 몸무게를 매개변수로 입력받는 생성자
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
/*
클래스에 생성자가 두 개 이상인 경우를 생성자 오버로드라고 함!!
필요하면 매개변수만 다른 생성자를 여러개 만들수 있음
 */