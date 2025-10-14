package inheritance;

public class ShapeEx {
    public static void main(String[] args) {
        Point point = new Point();
        Point point2 = new Point(10, 10);
        System.out.println(point);

        // Point[] points = { new Point(10, 10), new Point(20, 20), new Point(30, 30) };
        // points[0] = new Point();
        // points[0].x = 10;
        // points[0].y = 10;

        // points[1] = new Point();
        // points[1].x = 20;
        // points[1].y = 20;

        // points[2] = new Point();
        // points[2].x = 30;
        // points[2].y = 30;

        Point[] points = new Point[3];

        Point point1 = new Point(0, 0);
        points[0] = point1;

        points[1] = new Point(20, 20);
        points[2] = new Point(30, 30);

        Triangle triangle = new Triangle(points);
        triangle.draw();
    }
}
