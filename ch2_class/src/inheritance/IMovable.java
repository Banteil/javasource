package inheritance;

// 멤버변수에 final을 붙이면 상수 => 초기화 필요
public interface IMovable {
    // 상수 선언만 가능
    final int pos = 0;

    // abstract 없어도 추상 메서드
    void move(int x, int y);

    // static, default를 붙여야 일반 메서드 구현 가능
    static void print() { // 오버라이딩 불가
    }

    default void print2() { // 오버라이딩 가능
    }
}
