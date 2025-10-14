package exam;

public class Odd extends OddDetector {
    public Odd(int num) {
        super(num);
    }

    @Override
    public boolean isOdd() {
        return getN() % 2 != 0;
    }

}
