package util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 7, 8 };

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result ? "같음" : "다름");

        int[][] original = { { 1, 2 }, { 3, 4 } };
        int[][] cloned = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.equals(original, cloned) ? "같음" : "다름");

        // 얕은 복사 : copyOf()
        // 깊은 복사 : 새공간 생성 + 값 옮기기
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println(Arrays.equals(original, cloned2) ? "같음" : "다름");
        System.out.println(Arrays.deepEquals(original, cloned2) ? "같음" : "다름");
    }
}
