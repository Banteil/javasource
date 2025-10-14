package object;

public class CardEx2 {
    public static void main(String[] args) {
        // 배열
        int[] arr = new int[5]; // 0 으로 초기화
        arr[0] = 17;

        int[] arr2 = { 17, 18, 19 };

        // 참조형 배열
        String[] arr3 = new String[2];
        System.out.println("String 배열 초기화 " + arr3[0]); // null

        // null : 참조형에 특정 값 지정하지 않은 경우
        Card[] cards = new Card[3];
        System.out.println(cards[0]); // null
        cards[0] = new Card();
        cards[0].kind = "heart";
        cards[0].number = 8;

        cards[1] = new Card();
        cards[1].kind = "spade";
        cards[1].number = 7;

        cards[2] = new Card();
        cards[2].kind = "heart";
        cards[2].number = 2;

        for (Card card : cards) {
            System.out.println("번호 : " + card.number);
            System.out.println("종류 : " + card.kind);
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.println("번호 : " + cards[i].number);
            System.out.println("종류 : " + cards[i].kind);
        }

    }
}
