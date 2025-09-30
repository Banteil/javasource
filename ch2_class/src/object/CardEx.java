package object;

//변수
//1.인스턴스(속성, 멤버,필드)변수
//2.클래스 변수
//3.지역 변수 : 메서드 영역

public class CardEx {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.kind = "spade";
        card1.number = 2;

        System.out.print("card1 : ");
        Info(card1);

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;

        System.out.print("card2 : ");
        Info(card2);
    }

    static public void Info(Card card) {
        System.out.printf("종류 : %s, 번호 : %d, 가로 : %d, 세로 : %d\n", card.kind, card.number, card.width, card.height);
    }
}
