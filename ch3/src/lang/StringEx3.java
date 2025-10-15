package lang;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = "Hello World";

        // 문자열 거꾸로 출력하기
        String str1Reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str1Reversed += str1.charAt(i);
        }
        System.out.println(str1Reversed);
    }
}
