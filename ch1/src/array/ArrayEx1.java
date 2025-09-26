package array;

// 배열(array)
// 시험점수 저장 10 명
// 타입 배열명[] = new 타입[10]; 배열 선언과 생성

public class ArrayEx1 {
    public static void main(String[] args) {
        // 타입 : 기본형(int, long, float, double, boolean, char), 참조형(그 외)
        int[] arr1 = new int[10];
        System.out.println(arr1[3]);
        double[] arr2 = new double[5];
        System.out.println(arr2[0]);
        boolean[] arr3 = new boolean[3];
        System.err.println(arr3[1]);
        char[] arr4 = new char[3];
        System.out.println(arr4[0] + "arr");
        System.out.println(arr1);

        int[] arr5; // 선언
        arr5 = new int[3]; // 생성

        // 배열 선언, 생성, 초기화 동시
        int score[] = { 88, 90, 87 };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
