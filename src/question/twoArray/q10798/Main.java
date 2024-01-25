package question.twoArray.q10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String[] arr = new String[5];
        int max = -1;

        for(int i = 0; i < 5; i++){
            String read = bufferedReader.readLine();
            arr[i] = read;
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j].length() >= i + 1){
                    stringBuilder.append(Character.toString(arr[j].charAt(i)));
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
