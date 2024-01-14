package question.input.q2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * 입력: 472
         *      385
         *
         * 출력:  2360
         *       3776
         *       1416
         *       181720
         */

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String B = scanner.next();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));
    }
}
