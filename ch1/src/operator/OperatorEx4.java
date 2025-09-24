package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        // &&(and) ||(or) !(not)

        // x는 10보다 크고 , 20보다 작다.
        // var result = x > 10 && x < 20
        int x = 15;
        System.out.println(x > 10 && x < 20);

        // i는 2의 배수 또는 3의 배수이다.
        // i % 2 == 0 || i % 3 == 0
        int i = 6;
        System.out.println(i % 2 == 0 || i % 3 == 0);

        // i는 2의 배수 또는 3의 배수지만, 6의 배수는 아니다.
        // (i % 2 == 0 || i % 3 == 0) && (i % 6 != 0)
        // 만약 괄호를 치지 않는다면 &&(and)가 우선순위가 높음
        System.out.println((i % 2 == 0 || i % 3 == 0) && (i % 6 != 0));

        // 문자 ch는 대문자 또는 소문자이다.
        // (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
        char ch = 'b';
        boolean result = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        // !true => false / !false => true
        System.out.println(result);
        System.out.println(!result);
    }
}
