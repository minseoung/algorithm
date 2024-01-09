package question.q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
         * 입력: 77 77 7777
         * 출력: 7931
         */

        Scanner scanner = new Scanner(System.in);

        //범위가 21억이 넘으면 Long쓰기
        Long A = scanner.nextLong();
        Long B = scanner.nextLong();
        Long C = scanner.nextLong();

        System.out.println(A + B + C);
    }
}
