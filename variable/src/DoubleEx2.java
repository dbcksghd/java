public class DoubleEx2 {
    public static void main(String[] args) {
        double dnum = 1;
        for (int i = 0; i<10000; i++){
            dnum = dnum + 0.1;
        }
        System.out.println(dnum); //딱 1001이 나오지 않고 1001.00000...159가 나옴

        //부동 소수점 방식을 사용함!
    }
}
