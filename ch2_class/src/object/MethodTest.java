package object;

// 메서드
// 재사용성 높다
// 중복된 코드 제거
// 프로그램 구조화

// 1. 인스턴스(멤버) 메서드 : 클래스 영역 => 인스턴스 생성 후
// 2. 클래스 메서드 : 클래스 영역(static) => 클래스가 메모리에 올라갈때(공유)

public class MethodTest {
    // 두 개의 인자(== 매개변수)를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int num1, int num2) {
        // int result = num1 + num2;
        // return result;
        return num1 + num2;
    }

    // 두 개의 인자(== 매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    double divide(float num1, float num2) {
        return num1 / num2;
    }

    // 두 개의 문자열 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴

    // int[] arr = new int[3];
    // int[] arr = { 3, 4, 5 };

    int[] call(int[] arr) {
        return arr;
    }

    String print() {
        return "안녕하세요";
    }

}
