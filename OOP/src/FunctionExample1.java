public class FunctionExample1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2); // add 함수를 호출, 함수에 넣을 값으로 num1과 num2를 매개변수로 보냄(실 매개변수)
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다."); // 10 + 20 = 30입니다. 실행
    }

    public static int add(int n1, int n2){ // n1과 n2로 나와있지만 여기서는 num1을 n1, num2를 n2로 사용하겠다는 뜻(형식 매개변수)
        int result = n1 + n2; // result에 n1(num1)과 n2(num2)를 더한 값을 넣는다
        return result; // result를 반환한다. 여기서는 sum으로 return한 값이 들어감 (add함수 호출한 부분 아래로 이동)
    }

}



/*
add함수는 반환값이 정수형이라 int로 선언한다. 만약 문자열을 반환하고싶으면 String, true나 false값으로 반환하고싶으면 boolean 함수를 만들면 된다.
반환할 값이 없는 함수는 void를 적을것
 */










/*
함수란? '하나의 기능을 수행하는 일련의 코드'를 말한다.
만약 우리가 덧셈 기능이 필요한 순간이 있다고 가정해보자.
입력으로 10, 20, 30을 받았을때, sum = 10 + 20 + 30; sout(sum);로 출력할수 있다.
그런데 이런 덧셈이 필요한 순간이 많아진다면? 계속 저렇게 출력하는건 너무 번거로워진다.
이럴때 함수를 사용하면 더하기 기능이 필요할때마다 호출해서 연산하게 만들수 있다.
ex)
int add(){
    return a + b + c;
}
이처럼 함수는 어떤 기능을 수행하도록 미리 구현해놓고 필요할때마다 불러서 사용할수 있다.
 */