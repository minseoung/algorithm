package question.twoArray.q2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String read = bufferedReader.readLine();
        String[] readArr = read.split(" ");
        int N = Integer.parseInt(readArr[0]);
        int M = Integer.parseInt(readArr[1]);

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for(int i = 0; i < N; i++){
            int[] m = new int[M];

            String r = bufferedReader.readLine();
            String[] ra = r.split(" ");
            for(int j = 0; j < ra.length; j++){
                m[j] = Integer.parseInt(ra[j]);
            }

            arr1[i] = m;

        }

        for(int i = 0; i < N; i++){
            int[] m = new int[M];

            String r = bufferedReader.readLine();
            String[] ra = r.split(" ");
            for(int j = 0; j < ra.length; j++){
                m[j] = Integer.parseInt(ra[j]);
            }

            arr2[i] = m;

        }

        int[][] result = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
