import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        System.out.println(sc);

        A2412 a = new A2412();
        int b = a.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println(b);
    }
}