package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = i;
        // 자동 형변환 : float f = (float)i;
        // 바이트 값이 작은 것(작은 타입)을 큰 것(큰 타입)에 대입 시 가능
        int i2 = (int) f;

        double d = i;
        int i3 = (int) d;

        System.out.printf("i = %d, f = %f, i2 = %d, i3 = %d\n", i, f, i2, i3);
    }
}
