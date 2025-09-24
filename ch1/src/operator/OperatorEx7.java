package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자 하나 입력받기
        // 입력받은 숫자가 양수, 음수인지 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String result = num > 0 ? "양수" : num < 0 ? "음수" : "0";
        System.out.println(result);
        sc.close();
    }
}
