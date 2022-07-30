public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        System.out.println(-mathScore); //-가 붙은채로 출력됨 대신 mathScore 값이 바뀌지는 않음

        int totalScore = mathScore + engScore; //합계
        System.out.println(totalScore);

        double avgScore = totalScore/2.0; //평균
        System.out.println(avgScore);
    }
}
