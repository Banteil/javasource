package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;

        int sum = num + 20;

        int age = 25, maxSpeed = 10;

        final int MAX_SPEED = 20;

        var printVar = "num 변수 값 : %d \nnum + 20 = %d \nage = %10d, maxSpeed = %5d, MAX_SPEED = %d";
        System.out.printf(printVar, num, sum, age, maxSpeed, MAX_SPEED);
    }
}
