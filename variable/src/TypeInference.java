public class TypeInference {
    public static void main(String[] args) {
        var a = 10; // 정수형 변수로 컴파일됨
        var b = 10.0; // 실수형 변수로 컴파일됨
        var c = "helloWorld"; //문자형 변수로 컴파일됨

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = "유찬홍"; // 한번 추론한 타입과 같은 자료형은 대입 가능
        //c = 15;       이렇게 문자형으로 추론된 타입에 정수형은 대입 불가능
    }
}



//1. 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없다.
//2. var로 자료형 없이 변수를 선언하는 방법은 지역변수만 가능하다