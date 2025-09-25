package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기
        Scanner sc = new Scanner(System.in);

        int num = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 정수 입력 : ", i + 1);
            int tempNum = Integer.parseInt(sc.nextLine());
            if (tempNum < num) {
                num = tempNum;
            }
        }

        System.out.printf("가장 작은 숫자는 %d 입니다.\n", num);

        num = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 정수 입력 : ", i + 1);
            int tempNum = Integer.parseInt(sc.nextLine());
            if (tempNum < num) {
                num = tempNum;
            }
        }

        System.out.printf("가장 큰 숫자는 %d 입니다.\n", num);
        sc.close();
    }
}
