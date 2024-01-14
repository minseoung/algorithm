package question.repeat.q10;

import java.util.Scanner;

public class Main {
    /**
     * 책에는 long int는
     * 4바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는 8바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다.
     * 혜아는 이런 생각이 들었다. “int 앞에 long을 하나씩 더 붙일 때마다 4바이트씩 저장할 수 있는 공간이 늘어나는 걸까?
     * 분명 long long long int는 12바이트, long long long long int는 16바이트까지 저장할 수 있는 정수 자료형일 거야!”
     * 혜아가
     * N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= (N / 4); i++) {
            stringBuilder.append("long ");
            if (i == (N / 4)) {
                stringBuilder.append("int");
            }
        }

        System.out.println(stringBuilder);

        scanner.close();
    }
}
