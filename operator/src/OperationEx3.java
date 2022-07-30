public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i= i+2)<10);
        System.out.println(value);
        System.out.println(num1); //value값이 거짓이라 값 변화가 없음
        System.out.println(i);

        value = ((num1 = num1 + 10)>10) || ((i = i+2)<10); //단락 회로 평가(하나가 참이면 다른것도 참이여서 실행할 필요도 없음)
        System.out.println(value);
        System.out.println(num1); //value값이 참이라 10 더해짐
        System.out.println(i); // 논리합때문에 뒤를 계산할 필요가 없어서 값 변화가 없음

        boolean isMarried = !true; // 반대로 값이 바뀜
        System.out.println(isMarried);
    }
}
