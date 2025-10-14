package exam;

public class ColorTV extends TV {
    private int color;

    public ColorTV(int size) {
        super(size);
    }

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    protected int getColor() {
        return this.color;
    }

    public void printProperty() {
        System.out.printf("%d인치 %d컬러\n", getSize(), getColor());
    }
}
