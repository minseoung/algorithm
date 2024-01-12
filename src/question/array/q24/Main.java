package question.array.q24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
     * 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
     * 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
     * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String read1 = bufferedReader.readLine();
        String[] split1 = read1.split(" ");
        int N = Integer.parseInt(split1[0]);
        int M = Integer.parseInt(split1[1]);

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int n = 0; n < M; n++) {
            String read2 = bufferedReader.readLine();
            String[] split2 = read2.split(" ");
            int i = Integer.parseInt(split2[0]);
            int j = Integer.parseInt(split2[1]);

            int temp;
            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i] + " ");
        }
        System.out.println(stringBuilder);
    }
}
