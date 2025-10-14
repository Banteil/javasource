package inheritance;

// abstract(추상)
// 1. 추상클래스
// 2. 추상메서드 : {} 를 가질 수 없음

// 추상화 : 클래스 간의 공통점을 찾아내서 공통의 조상을 만드는 작업
// 구체화 : 상속을 통해 클래스를 구현, 확장하는 작업
public abstract class AbstractTest {

    // Abstract methods do not specify a body {}
    abstract void move();
}
