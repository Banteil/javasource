package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if
        // if 블럭 내에 또 다른 if
        // 점수 입력받기
        // 90점보다 크거나 같으면 A학점, 90~94점은 A-, 95~97은 A0, 98점 이상은 A+,
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        int onesDigit = score % 10;

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        char option = '0';
        if (onesDigit >= 8) {
            option = '+';
        } else if (onesDigit < 5) {
            option = '-';
        }

        System.out.printf("%c%c", grade, option);

        sc.close();
    }
}
