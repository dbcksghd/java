public class IntegerVariable {
    public static void main(String[] args) {
        short sVal = 10;
        byte bVal = 20;
        System.out.println(sVal+bVal);
        /*자료형이 달라도 프로그램이 시작할때는 4바이트를 기본 단위로 사용하기때문에
더하기 전에 int형으로 형변환 한 후 더함*/
        int num = 1234567890;
        long num1 = 1234567890L; //long을 쓸때는 꼭 뒤에 L을 붙이기

        long num2 = 1000; //이때는 1000이 int의 범위를 벗어나지 않으므로 L을 붙이지 않아도 됨
        //하지만 그래도 long는 뒤에 L붙이는걸 습관화 하는게 좋음
    }
}

