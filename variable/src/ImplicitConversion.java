

//묵시적 형 변환
public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // byte보다 int가 더 크므로 자동으로 형변환됨

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; // int보다 float가 더 정밀하므로 자동으로 형변환됨

        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; //둘이 더할때  int형이 float로 변환되고, 더한 결과값이 dNum에 들어가면서 double로 변환된다.
        System.out.println(dNum);
    }
}

/* 형변환 기본원칙
1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.
실수는 정수보다 더 표현 볌위가 넓으므로 더 정밀한 자료형이다. 즉 int에서 float로 갈때는 자동으로 이루어진다.
 */