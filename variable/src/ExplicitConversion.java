//명시적 형 변환

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; //각각 형변환 후 더하기 (실수->정수는 소수점 부분이 생략됨)
        int iNum4 = (int)(dNum1 + fNum2);    //더한 후 형변환하기
        System.out.println(iNum3); //1+0
        System.out.println(iNum4); //2.1 -> 2
    }
}
