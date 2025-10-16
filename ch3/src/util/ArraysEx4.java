package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 88, 22, 66, 15, 78, 99, 59 };

        // 검색
        // 1. 순차검색
        // 2. 이진검색

        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 100);
        System.out.println("66은 " + (pos + 1) + "번째에 위치함.");
    }
}
