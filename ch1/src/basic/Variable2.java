package basic;

public class Variable2 {
    public static void main(String[] args) {
        // long : L, l을 붙이지 않는 경우 int 타입의 범위를 벗어나지 않아야 함
        long num = 10;
        long num2 = 1000000000000L;

        var printVar = num + " " + num2;
        System.out.println(printVar);
    }
}
