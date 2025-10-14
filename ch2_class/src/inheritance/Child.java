package inheritance;

public class Child extends Parent {
    public Child() {
        super(15); // 부모의 생성자 호출
    }

    void play() {
        super.list();
        System.out.println("Play!!!");
    }

    @Override
    public void list() {
        // super.list();
        System.out.println("자식 클래스");
    }
}
