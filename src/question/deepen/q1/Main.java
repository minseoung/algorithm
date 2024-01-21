package question.deepen.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
     * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int[] chess = {1, 1, 2, 2, 2, 8};

        String read = bufferedReader.readLine();
        String[] split = read.split(" ");

        int[] find = new int[chess.length];
        for (int i = 0; i < split.length; i++) {
            find[i] = Integer.parseInt(split[i]);

            stringBuilder.append(chess[i] - find[i] + " ");
        }
        System.out.println(stringBuilder);
    }
}
