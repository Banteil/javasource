package lang;

import static java.lang.Math.*;

//Math : 기본적인 수학계산에 사용할 수 있는 메서드로 구성됨. 모든 메소드가 static임
public class MathEx {
    public static void main(String[] args) {
        Math.random();
        double val = 90.7552;
        System.out.println("반올림 " + round(val));
        System.out.println("올림 " + ceil(val));
        System.out.println("버림 " + floor(val));
        System.out.println("PT " + PI);
    }
}
