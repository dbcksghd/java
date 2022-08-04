public class BreakExample1 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 0; sum < 100; num++){
            sum += num;
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
/*
1부터 몇까지 더해야 100을 넘는지 알아보려고 만든 for문에서 num은 15가 나왔다.
하지만 1~15까지 다 더하면 120이 나온다. sum은 105인데?

합이 100을 넘는 순간의 num값은 14였지만, for문은 초기식 -> 조건식 -> 수행문 -> 증감식 -> 조건식이여서 num값이 14->15가 된 것이다.
우리가 원하는 값인 14를 얻기 위해서는 14->15가 되기 전에 for문을 끝내야 한다. 이때 필요한 것이 break이다. (BreakExample2 ㄱㄱ)
 */