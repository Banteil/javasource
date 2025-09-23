package basic;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int input = sc.nextInt();
        System.out.println(input);
        sc.close();
    }
}
