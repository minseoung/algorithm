package question.string.q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String read = bufferedReader.readLine();
        int result = 0;
        for (int i = 0; i < N; i++) {
            int c = read.charAt(i) - 48;
            result += c;
        }
        System.out.println(result);
    }
}
