package exam;

public abstract class OddDetector {
    private int num;

    public OddDetector(int num) {
        this.num = num;
    }

    protected int getN() {
        return num;
    }

    public abstract boolean isOdd();
}
