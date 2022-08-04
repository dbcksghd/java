public class ForExample2 {
    public static void main(String[] args) {
        int i = 0;
        for (; i<5; i++){ // i = 0으로 초기화되어있어서 초기식이 필요없음
            System.out.println("초기식 생략");
        }



        int j;
        int sum =0;
        for (j = 0; ; j++){
            sum += j;
            if (sum > 200) { //어떤 연산결과가 나왔을때 멈추고싶으면 조건을 for문 안에 넣어서 멈추게 할수 있다.
                System.out.println("조건식 생략");
                break;
            }
        }

        int k;
        for (k = 0; k<5; ){
            k = (++k) % 10; // 증감을 for문 안에 넣어서 돌릴수 있다.
        }
        System.out.println("증감식 생략");


        for (; ; ){ //이럴거면 사실 while문 쓰는게 더 편하다
            System.out.println("무한반복");
            break;
        }
    }
}
