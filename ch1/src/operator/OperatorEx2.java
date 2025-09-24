package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // + - * / %

        int a = 12, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b);
        // 서로 다른 타입의 연산 결과는 큰 타입을 따라감
        // int / int => int
        // int/float => float
        // int/double => double
        System.out.printf("%d %% %d = %d\n", a, b, a % b);

        char c1 = 'a', c2 = c1, c3 = ' ';
        c3 = (char) (c1 + 1);
        // 1 사용시 기본타입이 int로 인식됨
        // char + int = int;
        // byte, short, char 연산 시 자동으로 int 변환됨
        c2++;
        System.out.printf("c1 : %c, c2 : %c, c3 : %c\n", c1, c2, c3);

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
    }
}
