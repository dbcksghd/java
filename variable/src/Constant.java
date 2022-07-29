public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; //선언과 동시에 초기화
        final int MIN_NUM;

        MIN_NUM = 0; //사용 전 초기화하기 안하면 오류뜸

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);


        //MAX_NUM = 500; 상수는 값 변경이 불가능함
    }
}

//항상 변하지 않는 수를 상수(constant)라고 부름. EX) 원주율, 내 생일, 개교기념일
//상수 이름은 대문자를 주로 사용하고 여러 단어를 연결할때 _를 사용하면 보기 편함
// 상수를 선언할때는 final을 씀