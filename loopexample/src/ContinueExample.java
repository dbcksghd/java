public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;

        for (int num = 0; num <= 100; num++){
            if (num % 2 == 0) continue; // 만약 num을 2로 나눈 나머지가 0이라면(짝수라면) 이번 for문의 수행문들은 다 제낀다
                total += num; // 짝수면 이거 넘긴다는 뜻
        }
        System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
    }
}
