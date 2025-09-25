package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 년도를 입력받아 윤년, 평년 출력
        // 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니거나, 400으로 나눈 나머지가 0이면 윤년
        Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int year = Integer.parseInt(sc.nextLine());

        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        System.out.printf("%d년은 %s입니다.\n", year, isLeapYear ? "윤년" : "평년");
        sc.close();
    }
}
