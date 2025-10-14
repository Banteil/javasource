package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo info = new SubscriberInfo();

        // 속성 값 변경(초기화)
        // 1. 직접접근 : private 사용하면 불가
        // info.name = "홍길동";
        // 2. 생성자
        // 3. 메소드 : set~~~
        info.setId("abcdedfe77");
        info.setName("홍길동");
        info.changePassword("aeefdfe78$$");
        info.changePhone("010-1234-5678");

        // 가입자 정보 조회
        // 1. 간단조회 : toString() => 개발자 확인용
        // System.out.println(info.toString());
        System.out.println(info); // toString() 자동으로 호출됨
        // 2. 개별조회 : get~~~~()
        System.out.println("아이디 : " + info.getId());
    }
}
