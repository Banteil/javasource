package inheritance;

//부모
// 일반클래스 : 멤버변수, 상수, 생성자, 메서드
// 추상클래스 : 일반클래스 + 추상메서드
// 인터페이스 : 상수, 추상메서드, static or defalut 메서드
// ㄴ 표준화 가능, 서로 관계가 없는 클래스에게 관계 맺기 가능

public class FighterEx {
    public static void main(String[] args) {
        // IAttackable a = new IAttackable();

        IFightable fightable = new Fighter();
        Fighter fighter = new Fighter();
    }
}
