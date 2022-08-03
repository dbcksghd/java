public class WhileExample1 {
    public static void main(String[] args) {
        int num = 1; // num을 1로 초기화
        int sum = 0; // 반복문은 꼭 초기화해줘야함 !! 뭘 어떻게 더해야 하는지 명시되어있어야 하기 때문

        while(num <= 10){ // num 값이 10 이하라면 반복문 실행
            sum +=num; //sum과 num을 더한 값을 sum에 넣는다
            num++; // num을 올려서 10까지 다 더하게 만든다
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
//반복문 예시와 똑같은 결과가 나오는 것을 알수 있다.

/*
while(조건식){
    수행문 1;
    ...
    수행문 3;
}
 */