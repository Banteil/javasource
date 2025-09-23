package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형
        boolean flag = true;

        // 문자형
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab';

        var printVar = flag ? "참\nch = %c, ch2 = %c \nch = %c \nch2 = %d"
                : "거짓\nch = " + ch + ", ch2 = " + ch2 + "\nch = " + (ch + 1) + "\nch2 = " + (ch2 + 1);
        System.out.printf(printVar, ch, ch2, (ch + 1), (ch2 + 1));
    }
}
