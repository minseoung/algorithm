package question.twoArray.q2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int row = 0;
        int col = 0;

        int[][] arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            String read = bufferedReader.readLine();
            String[] readArr = read.split(" ");

            int[] c = new int[readArr.length];
            for(int j = 0; j < readArr.length; j++){
                c[j] = Integer.parseInt(readArr[j]);
                if(c[j] > max){
                    max = c[j];
                    row = i + 1;
                    col = j + 1;
                }
            }
            arr[i] = c;
        }

        System.out.println(max);
        System.out.print(row + " " + col);
    }
}
