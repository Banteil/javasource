package exam;

public class Div extends Calc {

    @Override
    public int calculate() {
        if (b == 0)
            return 0;
        return a / b;
    }
}
