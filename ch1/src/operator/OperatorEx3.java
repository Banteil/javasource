package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // > < >= <= == !=

        int a = 10;
        float f = 10.0f;
        // 연산 수행 전 피연산자의 타입을 맞춘 후 비교
        System.out.println(a == f);
        System.out.println(a != f);
        System.out.printf("'A' == 65 = %b\n", 'A' == 65);
        // Comparing identical expressions은 자기 자신과 동일한 표현식을 비교 시 발생
    }
}
