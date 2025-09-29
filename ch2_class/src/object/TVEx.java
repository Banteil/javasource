package object;

public class TVEx {
    public static void main(String[] args) {
        // TV 클래스 인스턴스 생성
        TV tv = new TV();
        System.out.println(tv);
        // 정수형 : 0. 실수형 : 0.0, 논리형 : false, 문자열 : 빈문자, String : null

        tv.setPower(true);

        tv.size = 48;
        tv.channel = 3;
        tv.setColor("black");

        System.out.println(tv);

        TV tv2 = new TV();
    }
}
