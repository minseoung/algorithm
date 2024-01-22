package question.deepen.q2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        int count = 0;
        String result = read;

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < arr.length; i++){
            result = result.replace(arr[i], "C");
        }
        System.out.println(result.length());
    }
}
