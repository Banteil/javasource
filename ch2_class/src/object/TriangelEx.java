package object;

public class TriangelEx {
    public static void main(String[] args) {

        // 속성(멤버변수) 초기화
        // 1. 직접접근
        // triangle1.baseLine = 12;
        // triangle1.height = 6;

        // 2. 생성자
        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이 : " + triangle1.getArea());

        // 3. setter 메소드
        Triangle triangle2 = new Triangle();
        triangle2.setBaseLine(10);
        triangle2.setHeight(5);
        System.out.println("넓이 : " + triangle2.getArea());
    }
}
