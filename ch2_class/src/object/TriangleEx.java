package object;

public class TriangleEx {
    public static void main(String[] args) {
        // 속성(멤버변수) 초기화
        // 1. 직접 접근 (ex. tri.baseLine = 10)
        // 접근권한자 문제 등으로 가능하면 사용하지 않음.
        // 2. 생성자
        Triangle tri = new Triangle(10, 5);
        System.out.println(tri);
        // 3. setter
        tri.setHeight(10);
        System.out.println(tri);
    }
}
