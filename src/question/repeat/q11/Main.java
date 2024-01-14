package question.repeat.q11;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= T; i++) {
            String read = bufferedReader.readLine();
            String[] split = read.split(" ");

            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            stringBuilder.append(A + B + "\n");
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
