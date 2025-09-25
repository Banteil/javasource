package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345 : 3 + 4 + 5 = 12
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (ex. 12345) : ");
        String temp = sc.nextLine();

        int result = 0;
        int num = Integer.parseInt(temp);
        while (num != 0) {
            result += num % 10;
            System.out.printf("%d\n", result);
            num /= 10;
        }

        // 문자열 하나하나 더하는 방법
        // int i = 0;
        // while (i < temp.length()) {
        // int num = Integer.parseInt(temp.substring(i, i + 1));
        // result += num;
        // System.out.printf("%d\n", result);
        // i++;
        // }

        System.out.printf("각 자릿 수 합 : %d", result);

        sc.close();
    }
}
