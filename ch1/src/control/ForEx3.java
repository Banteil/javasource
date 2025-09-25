package control;

public class ForEx3 {
    public static void main(String[] args) {
        // 문자 여러번 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        // 삼각형
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
