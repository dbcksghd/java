public class BreakExample2 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 0; ; num++){ // 조건식을 if로 넣어서 생략
            sum += num;
            if (sum >= 100) break; // 만약 100이 넘으면 for문 자체를 멈추기
        }

        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
/*
100 이상이 되는 순간 증감식도 멈춰버려서 14가 나온다. 이렇게 실행중 반복문을 중단하려면 break문을 사용하면 된다.
 */