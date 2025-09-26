package control;

import java.util.Scanner;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던짐
        // 눈의 합이 5이면 주사위 실행 스탑

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("다이스 롤 (Press Enter)");
            String input = sc.nextLine();
            if (input == "" || input == "\n") {
                int dice1 = (int) (Math.random() * 6 + 1);
                int dice2 = (int) (Math.random() * 6 + 1);

                System.out.println("첫번째 다이스의 숫자 : " + dice1);
                System.out.println("두번째 다이스의 숫자 : " + dice2);
                if (dice1 + dice2 != 5)
                    continue;
                else {
                    System.out.println("두 다이스의 숫자의 합이 5가 되었습니다.");
                    System.out.println("You Win!");
                    break;
                }
            } else {
                continue;
            }
        }

        sc.close();
    }
}
