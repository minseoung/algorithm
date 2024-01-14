package question.repeat.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
               stringBuilder.append("*");
                if (j == i) {
                    stringBuilder.append("\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
