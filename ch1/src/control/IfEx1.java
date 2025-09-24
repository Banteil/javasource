package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        // x가 0과 동일하다면 x == 0 출력

        if (x == 0) {
            System.out.println("x == 0");
        } else {
            System.out.println("x != 0");
        }

        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

        sc.close();
    }
}
