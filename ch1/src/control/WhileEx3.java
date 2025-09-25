package control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자한테 숫자를 계속 받아서 합계 출력
        // 종료 : 0 입력 시

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("숫자를 입력하세요 (그만두려면 0 입력)");
        while (true) {
            num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.printf("모든 숫자의 합 : %d", sum);

        sc.close();
    }
}
