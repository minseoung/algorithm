package question.array.q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
     * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
     * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String read1 = bufferedReader.readLine();
        String[] split1 = read1.split(" ");

        int N = Integer.parseInt(split1[0]);
        int X = Integer.parseInt(split1[1]);

        int[] arr = new int[N];
        String read2 = bufferedReader.readLine();
        String[] split2 = read2.split(" ");
        for (int i = 0; i < split2.length; i++) {
            arr[i] = Integer.parseInt(split2[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < X) {
                stringBuilder.append(arr[i] + " ");
            }
        }

        System.out.println(stringBuilder);
    }
}
