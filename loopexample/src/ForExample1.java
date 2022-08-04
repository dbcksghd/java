public class ForExample1 {
    public static void main(String[] args) {
        int i;
        int sum;
        for (i = 1, sum = 0; i<=10; i++){ //i가 1이고 sum을 0으로 둔다. 만약 i가 10 이하면 sum += i;를 실행하고 i를 1 올린다.
            sum += i;
        } // i가 11이 되는순간 멈춤
        System.out.println("1부터 10까지의 합은 " + sum + "입니다."); // 1부터 10까지의 합계
    }
}

/*for(초기식; 조건식; 증감식){
    수행문1;
    수행문2;
}
 */