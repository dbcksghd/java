public class OperationEx4 {
    public static void main(String[] args) {
        int num1 = 2;
        num1 += 1; // num1 = num1 + 1;과 같음
        System.out.println(num1);

        int num2 = 2;
        num2 -= 1; // num2 = num2 - 1;와 같음
        System.out.println(num2);

        int num3 = 2;
        num3 *= 1; // num3 = num3 * 1;과 같음
        System.out.println(num3);

        int num4 = 2;
        num4 /= 1; // num4 = num4 / 1;와 같음
        System.out.println(num4);

        int num5 = 2;
        num5 %= 1; // num5 = num5 % 1;와 같음
        System.out.println(num5);

        //비트연산은 다음에 배울 예정

        int num6 = 2;
        num6 <<= 1; // num6 = num6 << 1;과 같음
        System.out.println(num6);

        int num7 = 2;
        num7 >>= 1; // num7 = num7 >> 1;과 같음
        System.out.println(num7);

        int num8 = 2;
        num8 >>>= 1; // num8 = num8 >>> 1;과 같음
        System.out.println(num8);

        int num9 = 2;
        int Num9 = 3;
        num9 &= Num9; // num9 = num9 & Num9;와 같음
        System.out.println(num9);

        int num10 = 2;
        int Num10 = 3;
        num10 |= Num10; // num10 = num10 | Num10;과 같음
        System.out.println(num10);

        int num11 = 2;
        int Num11 = 3;
        num11 ^= Num11; // num11 = num11 ^ Num11;과 같음
        System.out.println(num11);

    }
}

//복잡할수 있는 연산식을 간단하게 줄여 쓸 수 있다는 장점이 있다.