package question.deepen.q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for(int i = 0; i < N; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }
    //해당 단어가 그룹단어인지 확인하는 함수
    public static boolean check() throws IOException{
        boolean[] check = new boolean['z' - 'a' + 1];
        char prev = 0;

        String str = bufferedReader.readLine();
        for(int i = 0; i < str.length(); i++){
            char now = str.charAt(i);

            if(prev != now){
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true;
                    prev = now;
                }else{
                    return false;
                }

            } else{
                continue;
            }
        }
        return true;
    }

}
