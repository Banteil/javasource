package object;

public class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long sub(long a, long b) {
        return a - b;
    }

    long mul(long a, long b) {
        return a * b;
    }

    long div(long a, long b) {
        return b != 0 ? a / b : 0;
    }
}
