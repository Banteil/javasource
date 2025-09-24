package basic;

import java.util.Scanner;

//System.in : 키보드 입력
//System.out : 화면 출력

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
