package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        // int[][] score = new int[3][4];
        // score[0][0] = 78;
        // score[1][1] = 68;

        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };

        // System.out.println(score.length);
        // System.out.println(score[0].length);

        // for (int i = 0; i < score.length; i++) {
        // for (int j = 0; j < score[i].length; j++) {
        // System.out.println(score[i][j]);
        // }
        // }

        // int[][] arr2 = new int[3][];
        // arr2[0] = new int[2];
        // arr2[1] = new int[3];
        // arr2[2] = new int[2];

        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 70 },
        };
        int[] subjectTotal = new int[jumsu[0].length];

        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");
        for (int i = 0; i < jumsu.length; i++) {

            System.out.printf("%4d", i + 1);
            int total = 0;
            for (int j = 0; j < jumsu[i].length; j++) {
                total += jumsu[i][j];
                subjectTotal[j] += jumsu[i][j];
                System.out.printf("%8d", jumsu[i][j]);
            }
            System.out.printf("%8d %7.1f", total, (double) (total / jumsu[i].length));
            System.out.println();
        }
        System.out.println("============================================");
        System.out.print("총점");
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.printf("%8d", subjectTotal[i]);
        }
    }
}
