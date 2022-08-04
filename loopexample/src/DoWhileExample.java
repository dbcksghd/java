public class DoWhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do{
            sum +=num;
            num++;
        } while (num<=10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
//do while문은 일단 조건이 참이든 아니든 한번 수행하고 조건식을 판별한다.