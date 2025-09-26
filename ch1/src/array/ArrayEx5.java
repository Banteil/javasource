package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0 ~ 9의 숫자로 초기화
        // int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] numbers = new int[10];
        Arrays.setAll(numbers, i -> i);

        System.out.println("스왑 전 : " + Arrays.toString(numbers));

        for (int i = 0; i < 100; i++) {
            int index = (int) (Math.random() * (numbers.length - 1));
            if (index == 0)
                continue;

            int temp = numbers[0];
            numbers[0] = numbers[index];
            numbers[index] = temp;
        }

        System.out.println("스왑 후 : " + Arrays.toString(numbers));
    }
}
