public class CharacterEx2 {
    public static void main(String[] args) {
        char ch1 = '한';
        char ch2 ='\uD55C'; //'한'의 유니코드

        System.out.println(ch1);
        System.out.println(ch2); // \uD55C의 유니코드 '한' 출력
    }
}
