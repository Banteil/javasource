package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙 연산 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        // 15, 25, +

        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        String operator;

        System.out.print("첫번째 연산 숫자 입력 : ");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.print("두번째 연산 숫자 입력 : ");
        num2 = Double.parseDouble(sc.nextLine());
        System.out.print("연산자 입력 : ");
        operator = sc.nextLine();

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                break;
        }

        System.out.printf("%f %s %f = %f", num1, operator, num2, result);
        sc.close();
    }
}
