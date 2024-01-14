package question.condition.q5;

import java.util.Scanner;

public class Main {
    /**
     * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
     * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
     * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = 0;

        if (A == B && A == C) {
            result = 10000 + (A * 1000);
        } else if ((A == B) || (B == C)) {
            if(A == B){
                result = 1000 + (A * 100);
            }
            else {
                result = 1000 + (C * 100);
            }
        } else if (A == C) {
            result = 1000 + (C * 100);
        } else {
            if(A > B){
                if(A > C){
                    result = 100 * A;
                }
                else {
                    result = 100 * C;
                }
            }else {
                if(B > C){
                    result = 100 * B;
                }else {
                    result = 100 * C;
                }
            }
        }
        System.out.println(result);
    }
}
