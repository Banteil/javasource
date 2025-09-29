package object;

public class MethodTest {
    // 두 개의 인자를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int a, int b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    String concat(String a, String b) {
        return a + b;
    }

    float divide(float a, float b) {
        return b != 0 ? a / b : 0;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴
    int[] throwArray(int[] array) {
        return array;
    }
}
