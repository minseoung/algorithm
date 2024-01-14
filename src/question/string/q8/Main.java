package question.string.q8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
     * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String read = bufferedReader.readLine();
        String[] split = read.split(" ");
        int result = split.length;
        for (String s : split) {
            if (s.isBlank()) {
                result--;
            }
        }
        System.out.println(result);
    }
}
