package question.repeat.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder1 = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("%-" + N + "s");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                stringBuilder1.append("*");
                if (j == i) {
                    stringBuilder1.append("\n");
                }
            }
        }
        System.out.println(stringBuilder1);
    }
}
