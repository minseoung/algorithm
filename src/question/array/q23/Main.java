package question.array.q23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
     * 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
     * 도현이는 앞으로 M번 공을 넣으려고 한다.
     * 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
     * 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
     * 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String read1 = bufferedReader.readLine();
        String[] split1 = read1.split(" ");
        int N = Integer.parseInt(split1[0]);
        int M = Integer.parseInt(split1[1]);
        int[] arr = new int[N];

        for (int n = 0; n < M; n++) {
            String read2 = bufferedReader.readLine();
            String[] split2 = read2.split(" ");
            int i = Integer.parseInt(split2[0]);
            int j = Integer.parseInt(split2[1]);
            int k = Integer.parseInt(split2[2]);

            for (int a = i - 1; a <= j - 1; a++) {
                arr[a] = k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i] + " ");
        }
        System.out.println(stringBuilder);
    }
}
