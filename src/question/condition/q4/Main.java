package question.condition.q4;

import java.util.Scanner;

public class Main {

    /**
     * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
     * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
     * 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
     * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
     * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int resultA = 0;
        int resultB = 0;

        //시간은 23 -> 0
        //분은 59 -> 0

        //60분보다 크면 시간과 분으로 쪼개야 함.
        if(C >= 60){
            int ca = C / 60;
            int cb = C % 60;

            if ((B + cb) >= 60) {
                resultB = (B + cb) % 60;
                resultA = ((B + cb) / 60) + A + ca;
                if (resultA >= 24) {
                    resultA %= 24;
                }
            }
            else {
                resultB = B + cb;
                resultA = A + ca;
                if (resultA >= 24) {
                    resultA %= 24;
                }
            }
        }
        else {
            int ca = 0;
            int cb = C;

            if ((B + cb) >= 60) {
                resultB = (B + cb) % 60;
                resultA = ++ca + A;
                if (resultA >= 24) {
                    resultA %= 24;
                }
            }
            else {
                resultB = B + cb;
                resultA = A + ca;
            }
        }

        System.out.println(resultA + " " + resultB);

    }
}
