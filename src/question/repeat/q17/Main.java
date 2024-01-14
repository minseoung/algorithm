package question.repeat.q17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     * 입력의 마지막에는 0 두 개가 들어온다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        boolean b = true;


        while (b) {
            String read1 = bufferedReader.readLine();
            if (read1.equals("0 0")) {
                b = false;
                continue;
            }
            String[] split = read1.split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            stringBuilder.append(A + B + "\n");
        }
        System.out.println(stringBuilder);
    }
}
