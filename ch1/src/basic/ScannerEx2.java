package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        // println(), print(), printf(),
        System.out.print("두자리 정수 입력 : ");
        String num = sc.nextLine(); // 35 => "35"
        // "35" => 35
        int input = Integer.parseInt(num);

        System.out.println("num = " + input);
        System.out.println("num = " + (input + 1)); // "35" + 1
        sc.close();
    }
}
