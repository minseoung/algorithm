package question.deepen.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 10988
     * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
     * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
     * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String read = bufferedReader.readLine();
        String compare = null;

        for(int i = read.length() - 1; i >= 0; i--){
            stringBuilder.append("" + read.charAt(i));
        }
        compare = stringBuilder.toString();

        if(read.equals(compare)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }


    }
}
