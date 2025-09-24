package basic;

import java.util.Scanner;

//nextLine의 엔터문자를 받는 문제 해결 예시

public class ScannerEx4 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        // String num1 = sc.nextLine(); 굳이 num1, 2를 선언해둘 이유가 없음
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // +. -. *, /
        String op = sc.nextLine();

        System.out.print("두번째 숫자 입력 : ");
        // String num2 = sc.nextLine();
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(input1 + input2);

        sc.close();
    }
}
