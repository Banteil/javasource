package object;

//변수
//1.인스턴스(속성, 멤버,필드)변수
//2.클래스 변수
//3.지역 변수 : 메서드 영역

public class Card {
    // private String kind; // 인스턴스
    // static String cv; // 클래스

    // void print(int i) {
    // int j = 0; // 지역
    // }

    String kind;
    int number;
    int width = 100;
    int height = 150;

    public void Info() {
        System.out.printf("종류 : %s, 번호 : %d, 가로 : %d, 세로 : %d\n", this.kind, this.number, this.width, this.height);
    }
}
