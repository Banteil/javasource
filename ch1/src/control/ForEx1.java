package control;

public class ForEx1 {
    public static void main(String[] args) {
        // int i = 0; 초기화
        // i < args.length; 조건식
        // i++; 증감식
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d번째 안녕하세요.\n", i);
            sum += i;
        }
        System.out.printf("1~10 합계 : %d\n", sum);

        // 1. int i = 1; 실행
        // 2. i <= 10; 조건식 검사 => true
        // 3. for 구문 안으로 진입 후 구문 실행
        // 4. i++ 실행
        // 5. 조건식 검사 => 2~4 실행
    }
}
