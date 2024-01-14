package question.string.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 단어 S와 정수 i가 주어졌을 때,
     * S의 i번째 글자를 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());

        System.out.println(S.charAt(i - 1));
    }
}
