package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단항연산자 : ++ --
        // ++ : +1, -- : -1
        int i = 5;
        i++; // i = i + 1;
        System.out.println(i);
        i--; // i = i - 1;
        System.out.println(i);

        int j = 6;
        ++j; // j = j + 1;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++;
        System.out.printf("l = k++; 실행 후, k = %d, l = %d\n", k, l);

        k = 5;
        l = 0;
        l = ++k;
        System.out.printf("l = ++k; 실행 후, k = %d, l = %d\n", k, l);
    }
}
