package control;

import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        // 메뉴를 보여준 후 메뉴 선택
        // 메뉴번호가 1~3 사이인데 다른 번호를 입력하면 다시 메뉴 보여주기
        // 0을 선택하면 종료되게 함

        final int CLOSE = 0;
        final int SQUARE = 1;
        final int SQUARE_ROOT = 2;
        final int LOG = 3;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료 : 0)");

            try {
                int menu = Integer.parseInt(sc.nextLine());

                if (menu == CLOSE) {
                    System.out.println("프로그램 종료");
                    sc.close();
                    break;
                } else if (menu < SQUARE || menu > LOG) {
                    System.out.println("정확한 메뉴 번호를 입력해 주세요.");
                    continue;
                }

                System.out.println("선택하신 메뉴는 " + menu + " 입니다.");
            } catch (NumberFormatException e) {
                System.out.println("정확한 숫자를 입력해 주세요.");
                continue;
            }
        }
    }
}
