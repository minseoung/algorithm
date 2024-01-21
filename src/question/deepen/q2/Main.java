package question.deepen.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                stringBuilder.append(" ");
            }
            for (int s = 1; s <= 2 * i - 1; s++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        for (int i = N - 1; i >= 1; i--) {
            for (int b = 1; b <= N - i; b++) {
                stringBuilder.append(" ");
            }
            for (int s = 1; s <= 2 * i - 1; s++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);

//        for(int i = 1; i <= 2 * N - 1; i++){
//            int blank = N - i;
//            int star = 2 * i - 1;
//            if(i > N){
//                blank = i - N;
//                star = star - (4 * (i - N));
//            }
//            for(int j = 1; j <= blank; j++){
//                stringBuilder.append(" ");
//            }
//            for(int s = star; s >= 1; s--){
//                stringBuilder.append("*");
//            }
//            stringBuilder.append("\n");
//        }
//        System.out.println(stringBuilder);

    }
}
