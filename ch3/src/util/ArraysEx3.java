package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        // int[] arr = { 37, 21, 56, 88, 22, 66, 15, 78, 99, 59 };
        Integer[] arr = { 37, 21, 56, 88, 22, 66, 15, 78, 99, 59 };
        // 정렬
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후 : " + Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 : " + Arrays.toString(arr));

        String[] arr2 = { "good", "height", "dog", "lion", "cat", "zero", "zoo" };
        Arrays.sort(arr2);
        System.out.println("arr2 오름차순 정렬 후 : " + Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println("arr2 내림차순 정렬 후 : " + Arrays.toString(arr2));

    }
}
