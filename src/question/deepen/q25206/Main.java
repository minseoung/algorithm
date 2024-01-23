package question.deepen.q25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double[] scoreDoub = {4.0, 3.0, 2.0, 1.0};
        double sum = 0.0; //과목별 학점 x 과목평점의 합
        double sumCredit = 0.0; //학점의 총합

        for(int i = 0; i < 20; i++){
            String read = bufferedReader.readLine();
            String[] split = read.split(" ");

            String subject = split[0];
            double credit = Double.parseDouble(split[1]);
            sumCredit += credit;

            String scoreStr = split[2];

            if(scoreStr.contains("0")){
                sum += credit * scoreDoub[scoreStr.charAt(0) - 'A'];
            } else if(scoreStr.contains("+")){
                sum += credit * (scoreDoub[scoreStr.charAt(0) - 'A'] + 0.5);
            } else if(scoreStr.contains("P")){
                sumCredit -= credit;
            }
        }
        System.out.println(sum/sumCredit);
    }
}
