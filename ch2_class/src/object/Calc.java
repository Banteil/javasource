package object;

public class Calc {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        // x,y 값을 이용해 평균
        // x + y / 2
        int result = plus(x, y);
        return result / 2;
    }

    void execute() {
        double result = avg(15, 8);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
