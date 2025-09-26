package control;

public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (true) {
            // sum이 100 초과 시 반복문 중지
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
