package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간 까지는 시급 10030
        // 8시간 이후는 1.5배로 받음
        // 오늘 근무시간 입력 후 하루 일당 산출 (일당은 정수형)

        Scanner sc = new Scanner(System.in);

        final int HOURLY_WAGE = 10030;
        final int SET_TIME = 8;
        final double RATIO = 1.5;

        System.out.print("근무 시간 입력 : ");
        int time = Integer.parseInt(sc.nextLine());
        int dailyWage = 0;

        if (time > SET_TIME) {
            dailyWage = (SET_TIME * HOURLY_WAGE) + (int) (((time - SET_TIME) * HOURLY_WAGE) * RATIO);
        } else {
            dailyWage = time * HOURLY_WAGE;
        }

        System.out.printf("하루 일당 : %d원\n", dailyWage);
        sc.close();
    }
}
