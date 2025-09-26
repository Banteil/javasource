package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        // 배열 복사
        // for문으로 하나하나 대입
        // System.arraycopy, Arrays.copyOf 등 함수 사용
        int[] temp1 = Arrays.copyOf(arr, arr.length * 2);
        System.out.println(Arrays.toString(temp1));
        int[] temp2 = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp2, 0, arr.length - 1);
        System.out.println(Arrays.toString(temp2));

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // 배열 abc와 num을 하나의 배열로 합치기
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 1, result, abc.length, num.length - 1);
        System.out.println(Arrays.toString(result));
    }
}
