package question.array.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];

        String read = bufferedReader.readLine();
        String[] split = read.split(" ");

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int v = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
