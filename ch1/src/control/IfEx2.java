package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A, B, C, D 등급 출력
        // >= 90 A, >= 80 B, >= 70 C, D
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        char result;

        // if (score >= 90) {
        // result = 'A';
        // } else if (score >= 80) {
        // result = 'B';
        // } else if (score >= 70) {
        // result = 'C';
        // } else {
        // result = 'D';
        // }

        if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        } else if (score >= 70) {
            result = 'C';
        } else {
            result = 'D';
        }

        System.out.printf("%c등급", result);
        sc.close();
    }
}
