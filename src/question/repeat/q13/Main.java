package question.repeat.q13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= T; i++) {
            String read = bufferedReader.readLine();
            String[] split = read.split(" ");

            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            stringBuilder.append("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
