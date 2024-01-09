import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int a = 0;
        int b = 0;

        int resultA = 0;
        int resultB = 0;

        if(C > 60){
            a = C / 60;
            b = C % 60;

            if((B + b) >= 60){
                a++;
                resultB = (B + b) - 60;
                if((A + a) >= 24){
                    resultA = (A + a) % 24;
                }else{
                    resultA = A + a;
                }
            }
        } else {
            b = C;
            if((B + b) >= 60){
                a++;
                resultB = (B + b) - 60;
                if((A + a) >= 24){
                    resultA = (A + a) % 24;
                }else{
                    resultA = A + a;
                }
            } else{
                resultA = A + a;
                resultB = B + b;
            }
        }

        System.out.println(resultA + " " + resultB);

    }
}
