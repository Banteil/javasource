package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // --------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // --------------------------------------
        // 선택 >> 1
        // 입금액 >> 100000

        Scanner sc = new Scanner(System.in);

        final String MENU = "--------------------------------------\n1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\n--------------------------------------\n선택 >> ";
        final int DEPOSIT = 1;
        final int WITHDRAWAL = 2;
        final int BALANCE = 3;
        final int CLOSE = 4;

        int curBalance = 0;

        while (true) {
            System.out.printf("%s", MENU);
            int select = 0;
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

            switch (select) {
                case DEPOSIT:
                    int inputDeposit = 0;
                    while (true) {
                        try {
                            System.out.print("예금액 입력 >> ");
                            inputDeposit = Integer.parseInt(sc.nextLine());
                            curBalance += inputDeposit;
                            break;
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                    break;
                case WITHDRAWAL:
                    int inputWithdrawal = 0;
                    while (true) {
                        try {
                            System.out.print("출금액 입력 >> ");
                            inputWithdrawal = Integer.parseInt(sc.nextLine());
                            if (inputWithdrawal > curBalance) {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            } else {
                                curBalance -= inputWithdrawal;
                                break;
                            }
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                    break;
                case BALANCE:
                    System.out.printf("현재 잔고 : %d원\n", curBalance);
                    break;
                case CLOSE:
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}
