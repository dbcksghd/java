public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        //char b2 = -66; -66이 아스키코드에 없으므로 변수를 선언할 때 오류가 생김

        System.out.println((char)a);
        System.out.println((char)b); //마찬가지로 정상적인 출력이 안됨
        System.out.println(a2);
    }
}
