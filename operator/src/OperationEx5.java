public class OperationEx5 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 42;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F'; // fatherAge가 motherAge보다 크다면 ch에 T를 넣고, 아니면 F를 넣는다

        System.out.println(ch);
    }
}


//조건식 ? 결과1 : 결과2;