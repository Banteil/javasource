package object;

public class Calc {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        int result = plus(x, y);
        return result / 2;
    }

    void excute() {
        double result = avg(15, 8);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
