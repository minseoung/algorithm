package question.q8;

import java.util.Scanner;

public class Main {
    /**
     * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        System.out.println(result);

        scanner.close();
    }
}
