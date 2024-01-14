package question.string.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
     * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            String read = bufferedReader.readLine();
            String[] split = read.split(" ");
            int R = Integer.parseInt(split[0]);
            String S = split[1];

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    stringBuilder.append(S.charAt(j));
                }
                if (j == S.length() - 1) {
                    stringBuilder.append("\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
