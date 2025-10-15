package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // String str1 = new String();
        String str1 = "abc";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        char[] ch = { 'A', 'B', 'C', 'D' };
        String str2 = new String(ch);
    }
}
