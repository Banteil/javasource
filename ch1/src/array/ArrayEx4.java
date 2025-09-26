package array;

import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = new int[10];
        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("score 배열 점수값 : " + Arrays.toString(score));
        int min = score[0], max = score[0];
        for (int i = 1; i < score.length; i++) {
            min = min > score[i] ? score[i] : min;
            max = max < score[i] ? score[i] : max;
        }
        System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);
    }
}
