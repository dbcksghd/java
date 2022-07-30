public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = ++gameScore; //더해서 lastScore1에 대입함
        System.out.println(lastScore1); //151출력

        int lastScore2 = --gameScore; //151이 된 gameScore에서 1을빼서 lastScore2에 대입함
        System.out.println(lastScore2); //150 출력

        int value1 = 10;
        int num1 = ++value1; //더해서 num1에 대입함

        System.out.println(num1); //num1은 11
        System.out.println(value1); //value1도 11

        int value2 = 10;
        int num2 = value2++; //대입하고 더함

        System.out.println(num2); //num2는 10
        System.out.println(value2); //value2는 11
    }
}
