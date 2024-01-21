package question.deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1157 {

    /**
     * 1157
     * 알파벳 대소문자로 된 단어가 주어지면,
     * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
     * 단, 대문자와 소문자를 구분하지 않는다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        String upRead = read.toUpperCase();

        int[] arr1 = new int['Z' - 'A' + 1];
        for(int i = 0 ; i < upRead.length(); i++){
            arr1[upRead.charAt(i) - 'A'] = arr1[upRead.charAt(i) - 'A'] + 1;
        }

        int max = -1;
        int index = -1;
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > max){
                index = i;
                max = arr1[i];
            }
            if(i == arr1.length - 1){
                for(int j = 0; j < arr1.length; j++){
                    if(j != index && arr1[j] == max){
                        count++;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println(Character.toString('A' + index));
        }
        else{
            System.out.println("?");
        }
    }
}
