package object;

public class SubcriberInfoEx {
    public static void main(String[] args) {
        SubcriberInfo info = new SubcriberInfo("hong1234", "!hong12345678", "010-1111-2222");
        System.out.println(info);

        info.changePassword("@hong987654321");
        info.changePhone("010-9999-8888");
        System.out.println(info);

        // toString() < 개발자 확인용으로 자주 씀
    }
}
