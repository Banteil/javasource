package util;

import java.util.Arrays;

// java.util.Arrays : 배열을 조작하기 쉽게 다양한 메서드 제공
//public static <T> T[] copyOf(T[] original, int newLength)
//static boolean 
//T, K, V, E : 변수명

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] newArr = new int[7];
        // 배열 복사
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr));
        int[] copyArr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr2));
    }
}
