public class NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;
        for (dan = 2; dan <=9; dan++){
            for (times = 1; times <= 9; times++){
                System.out.println(dan + " X " + times + " = " + dan * times);
            }
            System.out.println("\n");
        }
    }
}

/*
1. dan이 2니까 내부에 있는 for문 실행
2. times가 1인데 9보다 작으므로 dan(2) X times(1) = 2를 출력
3. 식이 끝나서 times++로 2가 됨
4. times가 2인데 9보다 작으므로 dan(2) X times(2) = 4를 출력
5. times가 9가 될때까지 반복
6. dan(2) X times(9) = 18 출력 후 times가 10이 되면 for문이 끝남
7. 줄바꿈을 출력하고 dan++ 한 후 다시 바깥쪽 for문으로 이동
8. dan이 3이니까 내부에 있는 for문 실행
9. 9 X 9 = 81이 나올때까지 반복
 */