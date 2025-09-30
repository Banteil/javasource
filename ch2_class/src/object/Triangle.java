package object;

public class Triangle {
    // 속성 : 밑변, 높이
    // 기능 : 삼각형 너비
    private double baseLine, height;

    public Triangle() {

    }

    public Triangle(double base, double height) {
        this.baseLine = base;
        this.height = height;
    }

    double getArea() {
        return baseLine * height / 2;
    }

    public double getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [baseLine = " + baseLine + ", height = " + height + ", area = " + getArea() + "]";
    }
}
