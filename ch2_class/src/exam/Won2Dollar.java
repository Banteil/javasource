package exam;

public class Won2Dollar extends Converter {
    private final String SRC = "원";
    private final String DEST = "달러";

    public Won2Dollar() {
        this.ratio = 1200.0;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return SRC;
    }

    @Override
    protected String getDestString() {
        return DEST;
    }

}
