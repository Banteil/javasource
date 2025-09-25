package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~10 숫자 중 짝수만 출력
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.printf("%d\n", i);
        }

        // 구구단 출력
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
