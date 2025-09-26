package array;

import java.util.Arrays;
import java.util.Scanner;

// 배열(array)
// 시험점수 저장 10 명
// 타입 배열명[] = new 타입[10]; 배열 선언과 생성
// 한번 생성하면 길이 변경 X

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] arr1 = { 'a', 'b', 'c', 'd' };
        double[] arr2 = { 99.8, 85.2 };
        String[] arr3 = { "bear", "snow", "moon" };

        // 1~10 임의의 수 생성 후 초기화
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d번째 수 : %d\n", i + 1, arr4[i]);
        }

        // 배열 길이가 명확하지 않는 경우 => 입력값으로 결정
        int[] arr5;
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 길이 입력");
        int length = sc.nextInt();
        arr5 = new int[length];

        // 배열의 주소값 출력 (단 char는 자바 특성상 값 출력)
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        // 배열이 가지고 있는 실제 값 출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // 차례대로 출력 (foreach)
        for (String str : arr3) {
            System.out.println(str);
        }
        sc.close();
    }
}
